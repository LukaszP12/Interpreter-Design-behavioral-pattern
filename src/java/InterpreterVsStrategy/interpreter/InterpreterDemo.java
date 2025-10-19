package InterpreterVsStrategy.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expression = new AddExpression(
                new NumberExpression(5),
                new MultiplyExpression(
                        new NumberExpression(3),
                        new NumberExpression(2)
                )
        );
        System.out.println(expression.interpret());
    }
}
