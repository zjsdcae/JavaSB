package com.example.freeMarker.controller;

import com.example.freeMarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentList {

    @RequestMapping("/list")
    public List list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 80.5));
        list.add(new Student(1, "Jerry", 70.5));
        list.add(new Student(3, "Paul", 58));
        model.addAttribute("list", list);
        return list;
    }

}
