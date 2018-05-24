package com.torres.service.impl;

import com.torres.dao.impl.StudentDaoImpl;
import com.torres.service.StudentService;
import com.torres.vo.Student;
import java.util.List;

/**
 * Created by Torres on 2018-05-15 11:36.
 */
public class StudentServiceImpl implements StudentService {

   StudentDaoImpl studentDao = new StudentDaoImpl();

    @Override
    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public boolean deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentDao.selectAllStudent();
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        return studentDao.selectStudentByName(name);
    }

    @Override
    public Student selectStudentById(int id) {
        return studentDao.selectStudentById(id);
    }
}
