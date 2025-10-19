package InterpreterVsBuilder.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        ExprNode tree = new ExprNode("+");
        tree.left = new ExprNode("5");
        tree.right = new ExprNode("*");
        tree.right.left = new ExprNode("3");
        tree.right.right = new ExprNode("2");

        System.out.println("Expression Tree Built (no evaluation yet).");
    }
}
