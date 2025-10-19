package InterpreterVsBuilder.builder;

class ExpressionBuilder {
    private ExprNode root;

    public ExpressionBuilder number(String value) {
        root = new ExprNode(value);
        return this;
    }

    public ExpressionBuilder add(String left, String right) {
        root = new ExprNode("+");
        root.left = new ExprNode(left);
        root.right = new ExprNode(right);
        return this;
    }

    public ExpressionBuilder multiply(String left, String right) {
        root = new ExprNode("*");
        root.left = new ExprNode(left);
        root.right = new ExprNode(right);
        return this;
    }

    public ExprNode build() {
        return root;
    }
}
