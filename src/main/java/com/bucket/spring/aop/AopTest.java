package com.bucket.spring.aop;

import net.sf.cglib.proxy.Enhancer;

public class AopTest {

    public static void main(String[] args) {
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        HelloServiceImpl helloService = ac.getBean("helloServicemm", HelloServiceImpl.class);
        helloService.sayHello();
        helloService.dd();
        
        InvocationHandler in = new InvocationHandler() {
        
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("ppp");
                return method.invoke(proxy, args);
            }
        };*/
        /* HelloServiceImpl dd = (HelloServiceImpl) Proxy.newProxyInstance(
            HelloServiceImpl.class.getClassLoader(), new Class[] { HelloServiceImpl.class }, in);
        
        dd.dd();*/

        Enhancer en = new Enhancer();
        en.setSuperclass(HelloServiceImpl.class);
        en.setCallback(new CglibCall());
        HelloServiceImpl dd2 = (HelloServiceImpl) en.create();
        dd2.dd();
    }
}
