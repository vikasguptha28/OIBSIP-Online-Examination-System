package com.exam.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.exam.model.Question;
import com.exam.model.Result;

public class ExamService {

    public Result startExam(
            ArrayList<Question> questions) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {

            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1)
                    + ". " + q.getQuestion());

            String[] options =
                    q.getOptions();

            for (int j = 0;
                 j < options.length;
                 j++) {

                System.out.println(
                        (j + 1)
                                + ". "
                                + options[j]);
            }

            System.out.print(
                    "Enter Answer: ");

            int ans = sc.nextInt();

            if (ans ==
                    q.getCorrectAnswer()) {

                score++;
            }
        }

        int total = questions.size();

        int wrong = total - score;

        double percentage =
                ((double) score / total) * 100;

        return new Result(
                total,
                score,
                wrong,
                percentage);
    }
}