package edu.pro.firstspring.dao.student.Interfaces;

import edu.pro.firstspring.model.Student;

import java.util.List;

public interface IStudentDAO {
    Student create(Student student);
    Student get(int id);
    Student update(Student student);
    Student delete(int id);
    List<Student> getAll();
}
