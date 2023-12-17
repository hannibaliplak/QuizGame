/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finalproject.quizgameapp;
import java.io.*;
import java.util.*;
/**
 *
 * @author shefi
 */
public class QuizzGame {
    private List<Question> questionPool;
    public QuizzGame() {
        questionPool = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questionPool.add(question);
    }

    public void loadQuestionsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    Question question = new Question(data[0], data[1], data[2]);
                    addQuestion(question);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Quiz createQuiz(int numberOfQuestions) {
        if (numberOfQuestions > questionPool.size()) {
            System.out.println("Not enough questions in the pool.");
            return null;
        }

        List<Question> selectedQuestions = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfQuestions; i++) {
            int index = random.nextInt(questionPool.size());
            Question question = questionPool.get(index);
            selectedQuestions.add(question);
            questionPool.remove(index); // Remove the selected question to avoid repetition
        }

        return new Quiz(selectedQuestions);
    }
}
