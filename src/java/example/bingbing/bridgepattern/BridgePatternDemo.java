package example.bingbing.bridgepattern;

/**
 * 桥接模式
 *
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape green = new Circle(100,100, 10, new GreenCircle());
        Shape red = new Circle(100,100, 10, new RedCircle());
        red.draw();
        green.draw();
    }
}
