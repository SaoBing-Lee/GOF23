package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 字节输出流--字符缓冲流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class BufferdTest02 {

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
        OutputStream os = null;
        try {
            os = new BufferedOutputStream(new FileOutputStream(out));
            //操作（写出）
            String mas = "测试一啊";
            byte [] bb = mas.getBytes();//字符串-->字节数组 编码
            os.write(bb,0,bb.length);
            os.flush(); //刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
