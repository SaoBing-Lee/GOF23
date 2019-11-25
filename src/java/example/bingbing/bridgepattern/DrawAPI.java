package example.bingbing.bridgepattern;

/**
 * 桥接模式
 *
 * 创建桥接实现接口
 * 使用场景：（列子）
 * JDK提供的JDBC数据库访问接口API正是经典的桥接模式的实现者，
 * 接口内部可以通过实现接口来扩展针对不同数据库的具体实现来进行扩展，
 * 而对外的仅仅只是一个统一的接口调用，调用方过于抽象，
 * 可以将其看做每一个JDBC调用程序（这是真实实物，当然不存在抽象）
 */
public interface DrawAPI {
    /**
     * 画圆
     * @param radius 半径
     * @param x
     * @param y
     */
    public void drawCircle(int radius, int x, int y);

    //TODO 假如需要画其他图形需要怎么做？实际应用场景？？
    //TODO 不是画其他图形，桥接模式是针对：比如画圆就是画不同的圆

    /**
     * 1、再写一个画其他图形的接口方法，再实现，再创建一个三角形的类实现shape。
     * 是否还有其他方法，这样的方法好像挺麻烦的，没有都需要修改类，会出现版本不兼容
     */
    /**
     * 三角形
     * @param x
     * @param y
     * @param z
     */
//    void drawTriangle( int x, int y, int z);

}
