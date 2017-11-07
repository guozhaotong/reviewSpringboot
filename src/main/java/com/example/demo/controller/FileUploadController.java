package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/7.
 */
@Controller
public class FileUploadController {
    //访问路径为：http://127.0.0.1:8080/file
    @RequestMapping("/file")
    public String file() {
//        return "file";
        return "file";
    }

    @RequestMapping("/multiFile")
    public String multiFile() {
        return "/multiFile";
    }

    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                            /*
                             *这段代码执行完毕之后，图片上传到了工程的跟路径；
                             *大家自己扩散下思维，如果我们想把图片上传到 d:/files大家是否能实现呢？
                             *等等;
                             *这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如：
                             * 1、文件路径；
                             * 2、文件名；
                             * 3、文件格式;
                             * 4、文件大小的限制;
                             */
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("D:\\" + file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            {
                return "上传成功";
            }
        } else {
            return "上传失败，因为文件是空的.";
        }
    }

    @RequestMapping(value = "/batch/upload", method = RequestMethod.POST)
    public @ResponseBody
    String handleFileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream =
                            new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "You failed to upload " + i + " =>" + e.getMessage();
                }
            } else {
                return "You failed to upload " + i + " becausethe file was empty.";
            }
        }
        return "upload successful";
    }
}
