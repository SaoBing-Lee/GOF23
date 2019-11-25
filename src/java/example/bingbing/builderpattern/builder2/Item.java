package example.bingbing.builderpattern.builder2;

public class Item {
   Drink drink;
   Burger burger;

    public Drink getDrink() {

        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }
}

class Drink{
    String name;
    int price;
    public Drink(String name ,int price){
        this.name=name;
        this.price=price;
    }
}

class Burger{
    String name;
    int price;
    public Burger(String name ,int price){
        this.name=name;
        this.price=price;
    }
}