package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private Map<String, Object> res = new HashMap<>();

    @RequestMapping("/hello")
//    @ResponseBody
    public Map<String, Object> Hello(){
        res.put("name","Stephen");
        res.put("city","San Jose");
        return res;
    }

}
