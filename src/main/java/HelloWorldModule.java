import com.google.inject.AbstractModule;
import service.HelloWorldService;
import service.HelloWorldServiceImpl;

public class HelloWorldModule extends AbstractModule {
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
    }
}
