package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 字符输出流   字符文件处理
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest05 {

    /**
     * 创建源
     * 选择流
     * 操作（读写内容）
     * 释放资源
     * @param args
     */
    public static void main(String[] args) {
        //创建源
        File out = new File("GOF23/out.md");
        //选择流
        Writer writer = null;
        try {
            writer = new FileWriter(out);
            //操作（写出）
//            写法一
//            String mas = "测试一啊,zhen的不一样嫩恩爱哦家";
//            char [] bb = mas.toCharArray();//字符串-->字节数组
//            writer.write(bb,0,bb.length);

            //            写法二
//            String mas = "测试一啊,zhen的不一样嫩恩爱哦家";
//            writer.write(mas);
//            writer.flush(); //刷新
            //            写法三
            writer.append("是是你很厉害咯").append("但是根我没有关系呢");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
