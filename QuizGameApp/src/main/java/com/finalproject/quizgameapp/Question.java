/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finalproject.quizgameapp;

/**
 *
 * @author shefi
 */
public class Question {
    private String questionText;
    private String correctAnswer;
    private String category;

    public Question(String questionText, String correctAnswer, String category) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public String getCategory() {
        return category;
    }
}
