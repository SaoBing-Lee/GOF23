package thread.bingbing;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName WebDownload
 * @descripetion 文件下载
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class WebDownload {
    /**
     * 文件下载
     * @param url 网路文件路径
     * @param name 存放路径
     */
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
