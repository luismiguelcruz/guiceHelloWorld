package service;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
