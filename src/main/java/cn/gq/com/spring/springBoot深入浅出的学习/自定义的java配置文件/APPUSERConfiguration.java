package cn.gq.com.spring.springBoot深入浅出的学习.自定义的java配置文件;

import cn.gq.com.spring.springBoot深入浅出的学习.pojo.UserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DELL
 * @create 2020/9/20 22:13
 * @update 2020/9/20
 * Description: 描述用户的配置文件
 * @since 1.0.0
 */
@Configuration
public class APPUSERConfiguration {
@Bean(name = "user") // 表示下面的我们初始化的类能够加入spring容器当中
public UserDTO initUserDto () {
    UserDTO userDTO = new UserDTO();
    userDTO.setId("1");
    userDTO.setName("gqq");
    userDTO.setNote("本地测试代码");
    return userDTO;
}

}
