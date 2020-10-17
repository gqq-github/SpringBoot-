package cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 * @create 2020/10/12 23:11
 * @update 2020/10/12
 * Description: springBean的前后置处理器
 * @since 1.0.0
 */
@Component
public class SpringBeanPostProcessorExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;
    }
}
