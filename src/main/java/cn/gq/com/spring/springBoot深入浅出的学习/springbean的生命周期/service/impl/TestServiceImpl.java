package cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service.impl;

import cn.gq.com.spring.aop.service.Test_UserService;
import cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author DELL
 * @create 2020/10/12 22:55
 * @update 2020/10/12
 * Description:
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements TestService , BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void saySomeThing(String word) {
        System.out.println("你说人话");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      // 实现beanFactoryAware
        System.out.println("执行实现beanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
      // 实现BeanNameAware
        System.out.println("调用BeanNameAware接口");
    }

    @Override
    public void destroy() throws Exception {
      // 实现DisposableBean
        System.out.println("调用DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
      // 实现InitializingBean InitializingBean 接口
        System.out.println("调用InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      // 实现applicationContextAware 接口
        System.out.println("调用ApplicationContextAware接口");
    }
    @PostConstruct
    public void init () {
        System.out.println("执行自定义的类初始化方法");
    }
    @PreDestroy
    public void destroy_I () {
        System.out.println("执行自定义的类销毁方法");
    }
}
