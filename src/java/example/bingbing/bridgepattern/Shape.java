package example.bingbing.bridgepattern;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * 形状抽象类
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();

}
