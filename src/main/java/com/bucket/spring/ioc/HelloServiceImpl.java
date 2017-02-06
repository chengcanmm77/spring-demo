package com.bucket.spring.ioc;

public class HelloServiceImpl implements HelloService {

    private HelloDao helloDao;

    public HelloServiceImpl() {

    }

    public HelloServiceImpl(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    @Override
    public void sayHello() {
        System.out.println("say happy new year");

    }

    public static void test() {
        System.out.println("static");
    }

    @Override
    public void insert() {
        helloDao.insert();

    }

    public HelloDao getHelloDao() {
        return helloDao;
    }

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

}
