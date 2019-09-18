package io.bingbing;

/**
 * @ClassName DecorateTest01
 * @descripetion 模拟咖啡：
 * 1、抽象组件：需要装饰的抽象组件（接口或抽象父类）
 * 2、具体组件：需要装饰的对象
 * 3、抽象装饰类：包含对象抽象组件的引用以及装饰者共有的方法、
 * 4、具体装饰类：被装饰的对象
 * @Author liyanbing
 * @Date 2019-09-17
 */
public class DecorateTest02 {

    public static void main(String[] args) {
        Drink coffee = new Coffee();
        Drink m = new Milk(coffee);
        System.out.println(m.cost()+":"+m.info());
        Drink su = new Suger(coffee);
        System.out.println(su.cost()+":"+su.info());
        Drink suger = new Suger(m);
        System.out.println(suger.cost()+":"+suger.info());
    }

}

//抽象组件
interface Drink{
    double cost();//费用
    String info();//说明
}
//具体组件
class Coffee  implements Drink{
    private String name="拿铁咖啡" ;

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}
//抽象装饰类

abstract  class Decorate implements Drink{
    //对象抽象组件的引用
    private  Drink drink;
    Decorate(Drink drink){
        this.drink=drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }
}

//具体装饰类
class Milk extends Decorate{

    Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()+5;
    }

    @Override
    public String info() {
        return super.info()+"添加牛奶";
    }
}


//具体装饰类
class Suger extends Decorate{

    Suger(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()+8;
    }

    @Override
    public String info() {
        return super.info()+"添加糖";
    }
}
