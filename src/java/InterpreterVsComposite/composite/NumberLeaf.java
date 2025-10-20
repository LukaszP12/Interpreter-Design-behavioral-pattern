package InterpreterVsComposite.composite;

class NumberLeaf implements ExpressionComponent {
    private int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}
