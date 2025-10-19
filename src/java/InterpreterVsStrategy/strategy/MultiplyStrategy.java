package InterpreterVsStrategy.strategy;

class MultiplyStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
