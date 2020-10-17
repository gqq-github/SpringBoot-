package cn.gq.com.spring.springBoot深入浅出的学习.componentscan注解;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author DELL
 * @create 2020/9/20 22:43
 * @update 2020/9/20
 * Description:
 * @since 1.0.0
 */
@Configuration
@ComponentScan // 没有输入扫描的包就是扫描当前类所在的所有文件
public class APPConfig {
}
