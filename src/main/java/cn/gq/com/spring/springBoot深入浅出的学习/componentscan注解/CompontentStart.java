package cn.gq.com.spring.springBoot深入浅出的学习.componentscan注解;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DELL
 * @create 2020/9/20 22:45
 * @update 2020/9/20
 * Description:
 * @since 1.0.0
 */
public class CompontentStart {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(APPConfig.class);
        ComponentScanDTO gqq = (ComponentScanDTO) acc.getBean("gqq");
        System.out.println();
    }
}
