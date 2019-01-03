package com.sumnear.controller;


import com.sumnear.comm.ResultVo;
import com.sumnear.model.Student;
import com.sumnear.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/studentApi/")
public class StudentApiController
{
    @Resource
    private IStudentService studentService;

    @RequestMapping("findAllStudentInfo")
    public @ResponseBody
    ResultVo findAllStudentInfo(@RequestParam("id") String id)
    {
        Student student = new Student();
        //不做过多验证判断
        if ("0".equals(id)) {
            student = null;
        } else {
            student.setId(new Integer(id));
        }
        ResultVo<List<Student>> result = new ResultVo<>();
        result.isSuccess(true);
        result.setResult(studentService.findAllStudent(student));
        return result;
    }
}