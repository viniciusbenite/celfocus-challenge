package challenges.flow;

import flow.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailAdapter implements IAdapter<IAction> {

    @Override
    public IEvent adapt(IAction action) throws AdapterException, ActionException {
        String msg = (String) action.execute();
        return new EmailEvent("MSG:"+msg);
    }
}
