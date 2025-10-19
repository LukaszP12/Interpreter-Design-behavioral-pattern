package InterpreterVsComposite.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        ExpressionComponent expr = new AddComposite(
                new NumberLeaf(5),
                new AddComposite(
                        new NumberLeaf(3),
                        new NumberLeaf(2)
                )
        );
        expr.print();
    }
}
