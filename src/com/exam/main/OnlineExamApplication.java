package com.exam.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.exam.model.Question;
import com.exam.model.Result;
import com.exam.model.Student;
import com.exam.service.ExamService;
import com.exam.service.LoginService;
import com.exam.service.ResultService;
import com.exam.util.QuestionBank;

public class OnlineExamApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student =
                new Student(
                        "student",
                        "1234");

        LoginService loginService =
                new LoginService();

        System.out.println(
                "===== ONLINE EXAM SYSTEM =====");

        System.out.print(
                "Username: ");

        String username =
                sc.nextLine();

        System.out.print(
                "Password: ");

        String password =
                sc.nextLine();

        boolean login =
                loginService.login(
                        student,
                        username,
                        password);

        if (!login) {

            System.out.println(
                    "Invalid Credentials");

            return;
        }

        System.out.println(
                "\nLogin Successful");

        ArrayList<Question>
                questions =
                QuestionBank.getQuestions();

        ExamService examService =
                new ExamService();

        Result result =
                examService.startExam(
                        questions);

        ResultService resultService =
                new ResultService();

        resultService.showResult(
                result);
    }
}