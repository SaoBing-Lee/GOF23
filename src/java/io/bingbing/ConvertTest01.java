package io.bingbing;

import java.io.*;
import java.net.URL;

/**
 * @ClassName FileTest
 * @descripetion 转换流
 *      InputStreamReader--字节流到字符流的桥梁  OutputStreamWriter--字符流到字节流到桥梁
 * 1、以字符流的形式操作字节流（操作纯文本）
 * 2、指定字符集（因为底层需要字符集指定，不然可能会出现乱码）
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class ConvertTest01 {


    public static void main(String[] args) {

//        copy("https://www.baidu.com", "GOF23/baidu.html");
        copyReader("https://www.baidu.com", "GOF23/baidu2.html");

    }


    /**
     * @param url
     * @param destPath
     */
    public static void copyReader(String url, String destPath) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new URL(url).openStream(), "utf-8"));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream(destPath), "utf-8"));) {
            //读取操作
            /**
             *  String msg= reader.readLine();
             *             while (msg != null) {
             *             这样会重复一行输出:
             *             原因：reader.readLine()只读取一行，writer.newLine()是读取下一行（新的一行），所以在循环中才可以连续获取
             */
            String msg ;
            while ((msg=reader.readLine()) != null) {
                writer.write(msg);
                writer.newLine();
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 使用字节流处理网络下载
     *
     * @param url
     * @param destPath
     */
    public static void copy(String url, String destPath) {
        InputStream is = null;
        OutputStream os = null;
        try {

            is = new BufferedInputStream(new URL(url).openStream());//节点流--网络流
            os = new BufferedOutputStream(new FileOutputStream(new File(destPath)));
            //操作（分段读取）
            byte[] fulsh = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(fulsh)) != -1) {
                os.write(fulsh, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
