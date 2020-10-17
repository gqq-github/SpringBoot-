package cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service;

import cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author DELL
 * @create 2020/10/12 23:16
 * @update 2020/10/12
 * Description:
 * @since 1.0.0
 */
@ComponentScan("cn.gq.com.spring.springBoot深入浅出的学习.springbean的生命周期.service")
public class BeanLifeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(BeanLifeMain.class);
        TestServiceImpl bean = con.getBean(TestServiceImpl.class);
        bean.saySomeThing("jjjj");
    }
}
