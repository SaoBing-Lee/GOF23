package example.bingbing.builderpattern;

//创建扩展了 Burger 和 ColdDrink 的实体类。
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger+鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
