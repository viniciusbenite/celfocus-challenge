package challenges.flow;

import flow.*;

import java.util.LinkedList;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailApp implements IApp<String> {
    private static final Logger logger = LogManager.getLogger(EmailApp.class);
    private Queue<String> messages;

    public EmailApp() {
        this.messages = new LinkedList<String>();
    }

    public String in(IEvent event) throws EventException, ProtocolException, ActionException {
        String message = (String) event.trigger();
        if (!message.startsWith("MSG:")) {
            throw new ProtocolException();
        }
        messages.add(message.replace("MSG:", ""));
        return message;
    }

    public String popMessage() {
        String message = messages.remove();
        return message;
    }
}
