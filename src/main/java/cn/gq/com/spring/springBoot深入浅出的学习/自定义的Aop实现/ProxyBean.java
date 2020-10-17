package cn.gq.com.spring.springBoot深入浅出的学习.自定义的Aop实现;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author DELL
 * @create 2020/10/17 15:56
 * @update 2020/10/17
 * Description:
 * @since 1.0.0
 */
public class ProxyBean implements InvocationHandler {
    private Object target;
    private MyInterceptor interceptor;
    private ProxyBean (Object target,MyInterceptor interceptor){
        this.target = target;
        this.interceptor = interceptor;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Boolean isException = false;
        MyInvocation myInvocation = new MyInvocation(target, method, args);
        interceptor.before();
       Object res = null ;
      try {
          if(interceptor.isAround()){
              res = interceptor.around(myInvocation);
          }else {
              res = method.invoke(target, args);
          }
      }catch (Exception e) {
          isException = true;
      }
      interceptor.after();
      if(isException){
          interceptor.afterThrowing();
      }else {
          interceptor.afterRunning();
          return res;
      }
        return null;
    }
    public static Object getBean (Object target,MyInterceptor myInterceptor){
        ProxyBean proxyBean = new ProxyBean(target, myInterceptor);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyBean);
    }
}
