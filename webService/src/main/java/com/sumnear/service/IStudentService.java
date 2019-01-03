package com.sumnear.service;

import com.sumnear.model.Student;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @authore sumnear
 * @create 2019-1-3 21:43
 */
public interface IStudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);

    /**
     * 根据ID删除学生
     * @param id
     * @return
     */
    Boolean deleteStudentById(Integer id);

    /**
     * 根据ID修改学生信息
     * @param student
     * @return
     */
    Boolean updateStudentById(Student student);

    /**
     * 按条件查找所有学生
     * @param student
     * @return
     */
    List<Student> findAllStudent(Student student);

}


