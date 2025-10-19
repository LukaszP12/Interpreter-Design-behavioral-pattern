package InterpreterVsStrategy.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setStrategy(new AddStrategy());
        System.out.println(calc.calculate(5, 3));

        calc.setStrategy(new MultiplyStrategy());
        System.out.println(calc.calculate(5, 3));
    }
}
