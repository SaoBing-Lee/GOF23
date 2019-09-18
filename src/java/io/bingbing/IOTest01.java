package io.bingbing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileTest
 * @descripetion 字节输入流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest01 {

    /**
     * 创建源
     * 选择流
     * 操作（读写内容）
     * 释放资源
     * @param args
     */
    public static void main(String[] args) {
        //创建源
        File i = new File("GOF23/README.md");
        //选择流
        FileInputStream is = null;
        try {
            is = new FileInputStream(i);
            //操作（分段读取）
            byte[] fulsh = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(fulsh)) != -1) {
                String str = new String(fulsh, 0, len);//字节数组--》字符串   解码
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
