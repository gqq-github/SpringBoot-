package cn.gq.com.spring.springBoot深入浅出的学习.自定义的Aop实现;

/**
 * @author DELL
 * @create 2020/10/17 14:15
 * @update 2020/10/17
 * Description: 定义拦截接口
 * @since 1.0.0
 */
public interface Interceptor {
    void before();

    Object around(MyInvocation invocation);

    Boolean isAround();

    void after();

   void  afterRunning();

    void afterThrowing();
}
