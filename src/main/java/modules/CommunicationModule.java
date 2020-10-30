package modules;

import com.google.inject.Inject;

public class CommunicationModule {

    @Inject
    private Logger logger;

    @Inject
    private Communicator communicator;

    public CommunicationModule(Boolean keepRecords) {
        if (keepRecords) {
            System.out.println("Message logging enabled");
        }
    }

    public boolean sendMessage(String message) {
        return communicator.sendMessage(message);
    }

}
