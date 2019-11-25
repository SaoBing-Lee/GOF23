package example.bingbing.builderpattern;

/**
 * BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）
 */
public class BuiderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("vegMeal");
        vegMeal.showItems();
        System.out.println("total:"+vegMeal.getCost());
        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("chickenMeal");
        chickenMeal.showItems();
        System.out.println("total:"+chickenMeal.getCost());
    }


}
