package challenges.flow;

import flow.AgentException;
import flow.EmptyFlowException;
import flow.IAction;
import flow.IAgent;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) throws AgentException, EmptyFlowException {

        final Logger logger = LogManager.getLogger(Main.class);
        IAgent user = new UserAgent();
        user.act();
        // List<IAction> flow = user.act();
        // if (flow.isEmpty()) {
        //     throw new EmptyFlowException();
        // }
    }
    
}
