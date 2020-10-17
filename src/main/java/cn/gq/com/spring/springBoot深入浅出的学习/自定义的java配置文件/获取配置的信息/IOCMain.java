package cn.gq.com.spring.springBoot深入浅出的学习.自定义的java配置文件.获取配置的信息;

import cn.gq.com.spring.springBoot深入浅出的学习.pojo.UserDTO;
import cn.gq.com.spring.springBoot深入浅出的学习.自定义的java配置文件.APPUSERConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DELL
 * @create 2020/9/20 22:17
 * @update 2020/9/20
 * Description: 获取容器中的对象
 * @since 1.0.0
 */
public class IOCMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(APPUSERConfiguration.class);
        UserDTO bean = acc.getBean(UserDTO.class);
        System.out.println();
    }
}
