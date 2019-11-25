package example.bingbing.builderpattern;

//创建扩展了 Burger 和 ColdDrink 的实体类。
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.f;
    }
}