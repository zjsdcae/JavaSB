package com.example.springbootfileupload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {
    Map<String, Object> res = new HashMap<>();

    @RequestMapping("/upload")
    public Map<String, Object> upload(@RequestParam("attach") MultipartFile file) throws IOException {
        // File info
        System.out.println("File name = " + file.getOriginalFilename());
        System.out.println("File type = " + file.getContentType());

        // Save to disk
        // file path
        String filePath = "/Users/yuan/Documents/";
        try{file.transferTo(new File(filePath + file.getOriginalFilename()));}
        catch (Exception e) {
            res.put(e.toString(), true);
        }
        res.put("success", true);
        return res;
    }
}
