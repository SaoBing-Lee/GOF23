package example.bingbing.builderpattern.builder2;

public class SixDiector implements Diector{
    private BurgerBuilder burgerBuilder;

    public SixDiector(BurgerBuilder burgerBuilder){
        this.burgerBuilder=burgerBuilder;
    }

    @Override
    public Item diectorItem() {
        Drink drink = burgerBuilder.builderDrink();
        Burger burger = burgerBuilder.builderBurger();
        Item item = new Item();
        item.setBurger(burger);
        item.setDrink(drink);
        return item;
    }
}
