package challenges.flow;

import flow.*;

import org.apache.log4j.Logger;

public class EmailAdapter implements IAdapter<IAction> {

    private static final Logger logger = Logger.getLogger(EmailAdapter.class);

    @Override
    public IEvent adapt(IAction action) throws AdapterException, ActionException {
        String msg = (String) action.execute();
        logger.debug("Adapting message: " + msg);
        return new EmailEvent("MSG:"+msg);
    }
}
