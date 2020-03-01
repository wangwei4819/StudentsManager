package site.beifeng.dao;

import site.beifeng.entity.Student;

import java.util.List;

public interface StudentDao {

        int getTotal();
        void addStudent(Student student);
        void deleteStudent(int id);
        void updateStudent(Student student);
        Student getStudent(int id);
        List<Student> list(int start, int count);
}
