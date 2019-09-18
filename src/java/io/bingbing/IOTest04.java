package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 字符输入流   字符文件处理
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest04 {

    public static void main(String[] args) {
        //创建源
        File i = new File("GOF23/README.md");
        //选择流
        Reader reader = null;
        try {
            reader = new FileReader(i);
            //操作（分段读取）
            char[] fulsh = new char[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = reader.read(fulsh)) != -1) {
                String str = new String(fulsh, 0, len);//字节数组--》字符串
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
