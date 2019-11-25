package example.bingbing.builderpattern;

/**
 * 创建实现 Item 接口的抽象类，提供了默认的功能--new Bottle();
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
