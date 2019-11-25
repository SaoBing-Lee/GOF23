package example.bingbing.strategypattem;

public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}
