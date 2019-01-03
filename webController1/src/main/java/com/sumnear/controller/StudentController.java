package com.sumnear.controller;


import com.sumnear.model.Student;
import com.sumnear.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student/")
public class StudentController
{
    @RequestMapping("home")
    public String home(Model model)
    {
        model.addAttribute("menuSelected1", "home");
        return "student/home";
    }

    @RequestMapping("studentInfo")
    public String studentInfo(Model model)
    {
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentInfo";
    }
}