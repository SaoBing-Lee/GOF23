package example.bingbing.builderpattern;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能--默认包装方法new Wrapper()。
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();

}
