package example.bingbing.builderpattern.builder2;

public class SixBurgerBuilder implements BurgerBuilder {

    @Override
    public Burger builderBurger() {
        return new Burger("汉堡",80);
    }

    @Override
    public Drink builderDrink() {
        return new Drink("饮料",10);
    }
}
