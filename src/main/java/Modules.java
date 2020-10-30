import com.google.inject.AbstractModule;
import service.*;

public class Modules extends AbstractModule {
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
    }
}
