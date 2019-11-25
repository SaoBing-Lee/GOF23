package example.bingbing.builderpattern;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class MealBuilder {
    /**
     * 创建素食汉堡套餐
     * @return
     */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 创建鸡肉汉堡套餐
     * @return
     */
    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
