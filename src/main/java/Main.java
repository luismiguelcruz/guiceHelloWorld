import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import modules.CommunicationModule;
import modules.TextEditorModule;
import service.HelloWorldService;
import service.SpellChecker;

public class Main {

    @Inject
    private HelloWorldService service;
    @Inject
    private TextEditorModule textEditor;

    public static void main(String[] args) {
        Main main = new Main();

        Injector injector = Guice.createInjector(new Modules());
        injector.injectMembers(main);//injects the implementation of the service

        CommunicationModule communication = injector.getInstance(CommunicationModule.class);

        main.testGuice();
        main.testGuice2();
    }

    public void testGuice()
    {
        service.sayHello();//usage of the service
    }

    public void testGuice2()
    {
        textEditor.makeSpellCheck();//usage of the service
    }
}