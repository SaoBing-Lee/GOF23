package example.bingbing.builderpattern;

//创建扩展了 Burger 和 ColdDrink 的实体类。
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi +百事可乐";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
