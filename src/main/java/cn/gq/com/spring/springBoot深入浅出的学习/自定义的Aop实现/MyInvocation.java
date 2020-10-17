package cn.gq.com.spring.springBoot深入浅出的学习.自定义的Aop实现;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DELL
 * @create 2020/10/17 15:24
 * @update 2020/10/17
 * Description:
 * @since 1.0.0
 */
// 使用的是建造者模式
public class MyInvocation {

    private Object target;

    private Method method;

    private Object[] params;
    /**
    * @Description:    java类作用描述
    * @param: target 需要代理的目标对象
    * @Author:         DELL
    * @CreateDate:     2020/10/17 15:46
    * @UpdateUser:     DELL
    * @UpdateDate:     2020/10/17 15:46
    * @return:
    * @UpdateRemark:   修改内容
    * @Version:        1.0
    */
 public MyInvocation (Object target, Method method ,Object[] params){
     this.params = params;
     this.target = target;
     this.method = method;
 }
 // 反射实现代理对象
 public Object proceed () throws InvocationTargetException, IllegalAccessException {
     return method.invoke(target, params);
 }

}
