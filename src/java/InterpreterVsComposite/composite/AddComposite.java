package InterpreterVsComposite.composite;

class AddComposite implements ExpressionComponent {
    private ExpressionComponent left, right;

    public AddComposite(ExpressionComponent left, ExpressionComponent right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" + ");
        right.print();
        System.out.print(")");
    }
}
