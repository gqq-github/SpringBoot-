package cn.gq.com.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author DELL
 * @create 2020/8/30 17:20
 * @update 2020/8/30
 * Description:
 * @since 1.0.0
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class FX_Main {
     public static void main(String[] args) {
             SpringApplication.run(FX_Main.class,args);
         }
}
