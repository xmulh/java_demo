public class Calculator {
    public int computer(int num1, int num2, String symbol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.computer(num1, num2);
    }
}
