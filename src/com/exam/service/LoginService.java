package com.exam.service;

import com.exam.model.Student;

public class LoginService {

    public boolean login(Student student,
                         String username,
                         String password) {

        return student.getUsername().equals(username)
                &&
                student.getPassword().equals(password);
    }
}