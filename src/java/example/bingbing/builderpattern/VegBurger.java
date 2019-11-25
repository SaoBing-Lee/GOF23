package example.bingbing.builderpattern;

//创建扩展了 Burger 和 ColdDrink 的实体类。
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger+素食汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
