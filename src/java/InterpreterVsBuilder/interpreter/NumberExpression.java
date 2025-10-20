package InterpreterVsBuilder.interpreter;

class NumberExpression implements Expression {
    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}
