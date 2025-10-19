package InterpreterVsComposite.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expr = new AddExpression(
                new NumberExpression(5),
                new AddExpression(
                        new NumberExpression(3),
                        new NumberExpression(2)
                )
        );
        System.out.println(expr.interpret());
    }
}
