package com.sumnear.service.impl;

import com.sumnear.dao.StudentDao;
import com.sumnear.model.Student;
import com.sumnear.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @authore sumnear
 * @create 2019-1-3 21:44
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService
{
    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudentById(Integer id) {
        Student student=new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }

    public List<Student> findAllStudent(Student student) {
        return studentDao.select(student);
    }
}


