package com.unicom.mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
//由于MapperScannerConfigurer执行的比较早，所以必须有这个注解
@AutoConfigureAfter(MybatisConfig.class)
public class ScannerConfig {

    private static final Logger logger = LoggerFactory.getLogger(ScannerConfig.class);

    @Bean
    public MapperScannerConfigurer config() {
        logger.info("############# 配置MapperScannerConfigurer ###############");
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.unicom.mapper");
        return configurer;
    }
}
