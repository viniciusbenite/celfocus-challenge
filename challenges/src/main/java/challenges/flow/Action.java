package challenges.flow;

import flow.ActionException;
import flow.IAction;

import org.javatuples.Pair;
import org.apache.log4j.Logger;

public class Action implements IAction<String> {

    private static final Logger logger = Logger.getLogger(Action.class);
    private Pair<String, String> tuple;

    public Action(Pair<String, String> tuple) {
        this.tuple = tuple;
    }

    @Override
    public String execute() throws ActionException {
        return tuple.getValue1();
    }

    @Override
    public String getType() {
        return tuple.getValue0();
    }
}
