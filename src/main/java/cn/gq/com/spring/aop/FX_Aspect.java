package cn.gq.com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * @author DELL
 * @create 2020/8/30 17:36
 * @update 2020/8/30
 * Description: 设置切面
 * @since 1.0.0
 */
@Component
@Aspect // 设置切面
public class FX_Aspect {
    /**
     * 定义切入点
     *
     * 表达式举例说明：execution(* com.example.demo..*.*(..))
     * 1) 执行 execution(xxx)	表达式的主体,xxx是表达式的规则;
     * 2) 第一个"*"符号	        表示返回值的类型任意; * 表示所有类型（就是方法的返回参数没有限制）， string 表示string类型（只有方法的返回参数是string才生效）
     * 3) com.example.demo	    AOP所切的包，就是在哪个包下生效，也可以用*（代表所有包，但是一般不会用*，不然一启动项目你就会产生大量的切面执行）
     * 4) 包名后面的".."	        表示当前包及子包
     * 5) 第二个"*"	            表示类名，*即所有类, *Controller2 表示类名后缀是Controller2的类
     * 6) .*(..)	            表示任何方法名，括号表示参数，两个点表示任何参数类型, .*Test1(..)	表示方法名后缀是Test1的所有方法，参数无限制，
     *                          .*Test(*)	表示方法名后缀是Test1的所有方法，参数只能是一个的，
     *                          .*Test(*,*)	表示方法名后缀是Test1的所有方法，参数只能是两个的。
     */
    // 表示cn.gq.com.spring.service.impl.Test_ 以Test_开头的左右方法参数为任意参数
   @Pointcut("execution(String cn.gq.com.spring.aop.service.impl.Test_*.*(..))")
    public void myPoint() {
    }
    @Before("myPoint()")
    public void doBefore (JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        //获取参数类型
        if(args!=null&&args.length>0)
        for (Object arg : args) {
            System.out.println("获取参数：【"+arg+"】");
        }
    }
    @After("myPoint()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("我在切点方法之后执行");
    }
    @Around("myPoint()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕切点入口");
        ;
        Object proceed = joinPoint.proceed();
        ;
        System.out.println("环绕切点出口");
         return  proceed ;
   }
    @AfterReturning("myPoint()")
    public void doAfterReturning(JoinPoint joinPoint){
        System.out.println("我在AOP层，我在返回一个结果后执行");
    }
    @AfterThrowing("myPoint()")
    public void doAfterThrowing(JoinPoint joinPoint){
        System.out.println("我在AOP层，我在异常时执行");
    }
}
