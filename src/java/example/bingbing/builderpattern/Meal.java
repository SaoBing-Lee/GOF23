package example.bingbing.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *创建一个 Meal 类，带有上面定义的 Item 对象。
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 总价
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item i:items) {
            cost += i.price();
        }
        return cost;
    }

    /**
     * 展示套餐
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
