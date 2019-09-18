package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 数据流
 * 1、先写出后读取
 * 2、读取的顺序与写入的顺序保持一致
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class DataTest {

    public static void data() throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream oos = new DataOutputStream(new BufferedOutputStream(baos));

        //操作数据类型+数据
        oos.writeInt(26);
        oos.writeBoolean(true);
        oos.flush();
        byte [] datas = baos.toByteArray();
        //读取

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //读取的顺序与写入的顺序保持一致
        int a = dis.readInt();
        boolean flag = dis.readBoolean();
        System.out.println(a);
    }

    public static void main(String[] args) throws IOException {


    }


}
