package cn.gq.com.spring.aop.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author DELL
 * @create 2020/8/30 18:05
 * @update 2020/8/30
 * Description:
 * @since 1.0.0
 */
@Service("userService")
public class Test_UserServiceImpl  {

    public String showUserInfo(String id) {
        return "hello AOP";
    }
}
