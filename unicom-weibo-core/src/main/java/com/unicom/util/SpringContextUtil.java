package com.unicom.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        SpringContextUtil.context = ac;
    }

    /**
     * 获取Spring ApplicationContext
     *
     * @return
     */
    public static ApplicationContext getContext() {
        return context;
    }

    /**
     * 获取bean
     *
     * @param name bean名称
     * @return
     * @throws BeansException
     */
    public static <E> E getBean(String name) throws BeansException {
        return (E) context.getBean(name);
    }

    /**
     * 获取bean
     *
     * @param clazz
     * @return
     */
    public static <E> E getBean(Class clazz) {
        return (E) context.getBean(clazz);
    }
}
