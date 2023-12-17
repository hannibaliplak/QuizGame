/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.finalproject.quizgameapp;
/**
 *
 * @author shefi
 */
public class QuizGameApp {

    public static void main(String[] args) {
        QuizzGame quizGame = new QuizzGame();
        quizGame.loadQuestionsFromFile("/home/shefi/NetBeansProjects/QuizGameApp/src/main/java/com/finalproject/quizgameapp/questions.txt");

        Quiz quiz = quizGame.createQuiz(5);
        if (quiz != null) {
            quiz.startQuiz();
        }
    }
}