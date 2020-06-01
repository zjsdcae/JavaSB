package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model){
        model.addAttribute("message", "Hello Thymeleaf");
//        model.addAttribute("secondLine", "Second Line test");
        double grade = 59;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA",convertGPA(grade));
        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2(Model model){
        List<User> lst = new ArrayList<>();
        lst.add(new User(1,"Tom", 30));
        lst.add(new User(2, "Ted", 20));
        lst.add(new User(3, "lil", 25));
        model.addAttribute("list", lst);
        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request, Model model){
        // Request
        request.setAttribute("request", "request data");
        // Sesstion
        request.getSession().setAttribute("session", "sesstion data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "demo2";
    }

    private String convertGPA(double grade){
        if(grade>=90){
            return "A";
        } else if (grade<90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 60) {
            return "C";
        } else {
            return "F";
        }
    }

}
