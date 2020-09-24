package challenges.flow;

import java.util.LinkedList;
import java.util.List;

import flow.*;

import org.apache.log4j.Logger;
import org.javatuples.Pair;

public class UserAgent implements IAgent {

    private static final Logger logger = Logger.getLogger(UserAgent.class);

    private List<IAction> actions = new LinkedList<>();
    private List<Pair<String, String>> userActions = new LinkedList<>();

    @Override
    public List<IAction> act() throws AgentException {
        userActions.add(Pair.with("EMAIL", "hello"));
        userActions.add(Pair.with("SMS", "world"));
        for (Pair<String, String> action : userActions) {
            actions.add(new Action(action));
            logger.debug("User did: " + action);
        }
        return actions;
    }
}
