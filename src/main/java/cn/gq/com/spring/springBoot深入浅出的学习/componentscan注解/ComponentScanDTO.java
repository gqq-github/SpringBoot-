package cn.gq.com.spring.springBoot深入浅出的学习.componentscan注解;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 * @create 2020/9/20 22:39
 * @update 2020/9/20
 * Description:
 * @since 1.0.0
 */
@Component("gqq")
public class ComponentScanDTO {
    @Value("lxx stupid")
    private String testStr;
}
