package InterpretrerDemo;

import java.util.HashMap;
import java.util.Map;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
                new AddExpression(
                        new VariableExpression("a"),
                        new VariableExpression("b")
                ),
                new VariableExpression("c")
        );

        Map<String, Integer> variables = new HashMap<>();
        variables.put("a", 10);
        variables.put("b", 5);
        variables.put("c", 3);

        int result = expression.interpret(new Context(variables));
        System.out.println("Result: " + result);
    }
}
