package com.springBootTest.dao;

import java.util.Collection;

import com.springBootTest.entity.Student;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
