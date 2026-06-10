package com.exam.model;

public class Result {

    private int total;
    private int correct;
    private int wrong;
    private double percentage;

    public Result(int total,
                  int correct,
                  int wrong,
                  double percentage) {

        this.total = total;
        this.correct = correct;
        this.wrong = wrong;
        this.percentage = percentage;
    }

    public void displayResult() {

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Questions : " + total);
        System.out.println("Correct Answers : " + correct);
        System.out.println("Wrong Answers   : " + wrong);
        System.out.println("Percentage      : " + percentage + "%");

        if (percentage >= 40)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}