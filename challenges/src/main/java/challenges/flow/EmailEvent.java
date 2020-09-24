package challenges.flow;

import org.apache.log4j.Logger;

import flow.ActionException;
import flow.EventException;
import flow.IEvent;

public class EmailEvent implements IEvent<String> {

    private static final Logger logger = Logger.getLogger(EmailEvent.class);
    private String body;

    public EmailEvent(String body) {
        this.body = body;
    }

    @Override
    public String trigger() throws EventException, ActionException {
        logger.debug("Event triggered");
        return body;
    }
}
