package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 对象流   ----写入到文件中
 * 1、先写出后读取
 * 2、读取的顺序与写入的顺序保持一致
 * 3、不是所有的对象都可以序列化（实现 Serializable 才能序列化 ）
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class ObjectTest02 {



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        obj();

    }

    /**
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void obj() throws IOException, ClassNotFoundException {
        //写出--> 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("GOF23/obj.ser")));

        //操作数据类型+数据
        oos.writeInt(26);
        oos.writeBoolean(true);
        oos.writeObject("编码辛酸泪");
        oos.writeObject("谁解其中味");
        Employee e = new Employee("狗国",20000);
        oos.writeObject(e);
        oos.flush();
        oos.close();
        //读取-->反序列化
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("GOF23/obj.ser")));
        //读取的顺序与写入的顺序保持一致
        int a = ois.readInt();
        boolean flag = ois.readBoolean();
        String strObj = (String) ois.readObject();
        String strObj2 = (String) ois.readObject();
        Employee empObject = (Employee) ois.readObject();
        System.out.println(empObject.getName()+"-->"+empObject.getSalary());
        System.out.println(strObj+"-->"+strObj2);
        ois.close();
    }

}