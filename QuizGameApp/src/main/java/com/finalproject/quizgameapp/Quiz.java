/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finalproject.quizgameapp;
import java.util.*;
/**
 *
 * @author shefi
 */
public class Quiz {
    private List<Question> questionsList;
    private int userScore;

    public Quiz(List<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public void startQuiz() {
        userScore = 0;
        for (Question question : questionsList) {
            question.displayQuestion();
            String userAnswer = getUserInput();
            if (question.checkAnswer(userAnswer)) {
                userScore++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }
        System.out.println("Quiz completed. Your score: " + userScore + "/" + questionsList.size());
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
