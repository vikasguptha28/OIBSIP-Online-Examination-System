package com.exam.util;

import java.util.ArrayList;

import com.exam.model.Question;

public class QuestionBank {

    public static ArrayList<Question> getQuestions() {

        ArrayList<Question> questions =
                new ArrayList<>();

        questions.add(new Question(
                "Java is a ?",
                new String[]{
                        "Language",
                        "Browser",
                        "Database",
                        "OS"},
                1));

        questions.add(new Question(
                "JVM stands for ?",
                new String[]{
                        "Java Virtual Machine",
                        "Java Variable Machine",
                        "Joint VM",
                        "None"},
                1));

        questions.add(new Question(
                "Which package contains Scanner?",
                new String[]{
                        "java.io",
                        "java.util",
                        "java.sql",
                        "java.net"},
                2));

        questions.add(new Question(
                "Keyword for inheritance?",
                new String[]{
                        "super",
                        "this",
                        "extends",
                        "implements"},
                3));

        questions.add(new Question(
                "Java developed by?",
                new String[]{
                        "Google",
                        "Microsoft",
                        "Sun Microsystems",
                        "Apple"},
                3));

        return questions;
    }
}