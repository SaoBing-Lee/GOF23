package example.bingbing.bridgepattern;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画圆[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
