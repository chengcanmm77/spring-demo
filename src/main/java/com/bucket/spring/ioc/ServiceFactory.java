package com.bucket.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceFactory {

    private static HelloService service = new HelloServiceImpl();

    public HelloService createService() {
        return service;
    }

    private ServiceFactory() {

    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloService helloService = ac.getBean("helloService", HelloService.class);
        helloService.sayHello();

        HelloService helloService2 = ac.getBean("helloService2", HelloService.class);
        helloService2.insert();
        HelloService helloService21 = ac.getBean("helloService2", HelloService.class);
        System.out.println(helloService2 == helloService21);

        HelloService helloService3 = ac.getBean("helloService3", HelloService.class);
        helloService3.insert();
        HelloService helloService31 = ac.getBean("helloService3", HelloService.class);
        System.out.println(helloService3 == helloService31);

    }
}
