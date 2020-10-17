package cn.gq.com.spring.springBoot深入浅出的学习.自定义的Aop实现;

import java.lang.reflect.InvocationTargetException;

/**
 * @author DELL
 * @create 2020/10/17 15:50
 * @update 2020/10/17
 * Description:
 * @since 1.0.0
 */
public class MyInterceptor implements Interceptor {
    @Override
    public void before() {
        System.out.println("前置方法执行");
    }

    @Override
    public Object around(MyInvocation invocation) {

        try {
            return invocation.proceed() ;
        } catch (InvocationTargetException e) {

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }finally {
            System.out.println("环绕方法执行");
        }
        return null;
    }
    //表示要执行环绕方法
    @Override
    public Boolean isAround() {
        return true;
    }

    @Override
    public void after() {
        System.out.println("after 方法执行");
    }

    @Override
    public void afterRunning() {
        System.out.println("方法运行完执行");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing执行");
    }
}
