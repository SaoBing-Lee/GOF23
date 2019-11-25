package example.bingbing.strategypattem;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+10=" + context.executeStrategy(10, 10));
    }
}
