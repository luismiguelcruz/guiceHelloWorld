import com.google.inject.Guice;
import com.google.inject.Injector;
import modules.CommunicationModule;
import service.HelloWorldService;

import javax.inject.Inject;

public class Main {

    @Inject
    private HelloWorldService service;

    public static void main(String[] args) {
        Main main = new Main();

        Injector injector = Guice.createInjector(new Modules());
        injector.injectMembers(main);//injects the implementation of the service

        CommunicationModule communication = injector.getInstance(CommunicationModule.class);

        main.testGuice();
    }

    public void testGuice()
    {
        service.sayHello();//usage of the service
    }
}