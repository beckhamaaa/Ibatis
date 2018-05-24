package com.torres.test;


import com.torres.service.impl.StudentServiceImpl;
import com.torres.vo.Student;

import java.util.List;

/**
 * Created by Torres on 2018-05-15 11:41.
 */
public class TestIbatis {

    public static void main(String[] args) {
        StudentServiceImpl studentService=new StudentServiceImpl();
//        System.out.println("测试插入");

//        Student addStudent = new Student();
//        addStudent.setName("张三");
//        addStudent.setBirth(Date.valueOf("2011-09-02"));
//        addStudent.setScore(88);
//        System.out.println(studentService.addStudent(addStudent));

//        System.out.println("测试根据id查询");
//        System.out.println(studentService.selectStudentById(1));
//
//        aa
        System.out.println("测试模糊查询");
        List<Student> mohuLists = studentService.selectStudentByName("李");
        for (Student student : mohuLists) {
            System.out.println(student);
        }
//
//        System.out.println("测试查询所有");
//        List<Student> students = studentService.selectAllStudent();
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        System.out.println("根据id删除学生信息");
//        System.out.println(studentService.deleteStudentById(10));
//
//        System.out.println("测试更新学生信息");
//        Student updateStudent = studentService.selectStudentById(5);
//        updateStudent.setName("李四1");
//        updateStudent.setBirth(Date.valueOf("2011-08-07"));
//        updateStudent.setScore(81);
//        System.out.println(studentService.updateStudent(updateStudent));
    }
}
