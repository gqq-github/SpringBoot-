package cn.gq.com.spring.springBoot深入浅出的学习.自定义的Aop实现;

/**
 * @author DELL
 * @create 2020/10/17 16:17
 * @update 2020/10/17
 * Description:
 * @since 1.0.0
 */
public class AopMain implements testInterface  {
    public static void main(String[] args) {
        AopMain aopMain = new AopMain();
        testInterface bean =(testInterface) ProxyBean.getBean(aopMain, new MyInterceptor());
          bean.say();
    }

    @Override
    public void say() {
        System.out.println("say");
    }
}
interface  testInterface {
    void say();
}