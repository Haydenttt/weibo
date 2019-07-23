package com.unicom.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@MapperScan("com.unicom.mapper")
public class MybatisConfig implements TransactionManagementConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(MybatisConfig.class);

    @Autowired
    private UnicomBasicDataSource unicomSource;
    @Bean(destroyMethod = "")
    public DataSource dataSource() {
        logger.info("############# 配置DataSource ##################");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(unicomSource.getInitialSize());
        dataSource.setDriverClassName(unicomSource.getDriverClassName());
        dataSource.setPassword(unicomSource.getMysqlPassword());
        dataSource.setUsername(unicomSource.getMysqlUserName());
        dataSource.setUrl(unicomSource.getUrl());
        dataSource.setValidationQuery(unicomSource.getValidationQuery());
        dataSource.setValidationQueryTimeout(unicomSource.getValidationQueryTimeout());
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxActive(20);
        dataSource.setMinIdle(5);

        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() {
        logger.info("############# 配置SqlSessionFactory ##################");
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        bean.setTypeAliasesPackage("com.unicom.model");
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath*:com/unicom/mapper/impl/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() {
        logger.info("############# 配置SqlSessionTemplate ##################");
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Override
    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        logger.info("############# 配置PlatformTransactionManager ##################");
        return new DataSourceTransactionManager(dataSource());
    }
}
