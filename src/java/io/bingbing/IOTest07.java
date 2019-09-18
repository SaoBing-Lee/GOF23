package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 字节数组输出流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest07 {

    /**
     * 创建源:内部维护
     * 选择流：不关联源
     * 操作（读写内容）
     * 释放资源 ：可以不处理
     *
     * 需要获取数据：toByteArray（）
     * @param args
     */
    public static void main(String[] args) {
        //创建源
        byte [] dest = null;
        //选择流
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            //操作（写出）
            String mas = "测试一啊";
            byte [] bb = mas.getBytes();//字符串-->字节数组 编码
            baos.write(bb,0,bb.length);
            baos.flush(); //刷新
            //获取数据
            dest = baos.toByteArray();
            System.out.println(new String(dest,0,dest.length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
