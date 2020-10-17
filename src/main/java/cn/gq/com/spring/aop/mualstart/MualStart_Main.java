package cn.gq.com.spring.aop.mualstart;

import cn.gq.com.spring.aop.service.impl.Test_UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author DELL
 * @create 2020/8/30 19:50
 * @update 2020/8/30
 * Description: AOP执行的入口
 * @since 1.0.0
 */
@ComponentScan("cn.gq.com.spring.*")
@EnableAspectJAutoProxy
public class MualStart_Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MualStart_Main.class);

        Test_UserServiceImpl bean = (Test_UserServiceImpl) annotationConfigApplicationContext.getBean("userService");

        bean.showUserInfo("haha");
    }
}
