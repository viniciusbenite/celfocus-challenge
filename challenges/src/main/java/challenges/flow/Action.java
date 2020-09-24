package challenges.flow;

import flow.ActionException;
import flow.IAction;

import org.javatuples.Pair;

public class Action implements IAction<String> {

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
