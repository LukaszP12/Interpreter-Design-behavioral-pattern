package InterpretrerDemo;

import java.util.Map;

class Context {
    private Map<String, Integer> variables;

    public Context(Map<String, Integer> variables) {
        this.variables = variables;
    }

    public int getValue(String variable) {
        return variables.get(variable);
    }
}
