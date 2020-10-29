import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import service.HelloWorldService;

public class Main {

    @Inject
    private HelloWorldService service;//hello service

    public static void main(String[] args) {

        Main main = new Main();

        Module module = new HelloWorldModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);//injects the implementation of the service

        main.testGuice();
    }

    public void testGuice()
    {
        service.sayHello();//usage of the service
    }
}