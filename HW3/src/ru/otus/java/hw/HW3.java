package ru.otus.java.hw;

import java.util.Scanner;

/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */

/*
Вопросы:
1) [][] массив массива. Как в этом занятии применить?

* */
public class HW3 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        //Вопросы
        String Question1 = "Укажите год основания Санкт-Петербурга";
        String Question2 = "Назовите столицу Таджикистана";
        String Question3 = "Совсем недавно Александр Овечкин вышел на второе место среди лучших снайперов в истории лиги NHL перегнав именно этого хоккеиста";
        String[] questions = {Question1,Question2,Question3};

        // TODO: Массив вариантов ответов
        Answerers1[] AnswerersMassive1 = Answerers1.values();
        Answerers2[] AnswerersMassive2 = Answerers2.values();
        Answerers3[] AnswerersMassive3 = Answerers3.values();
        /*Answerers1[] AnswerersMassive1 = Answerers1.values();
        String[][] answerOptions = {
                questions,
                Answerers1.values()
        };*/

        //Правильные ответы
        //String[] correctAnswers = {"1","1","1"};
        //String[] correctAnswersAlt = {"Year1703","A2","A3"};
        char[] correctAnswers = {'2','2','2'};

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {

            //Вывод вопроса на экран
            System.out.println(questions[i]);

            //Вывод вариантов ответов на экран
            switch (i) {
                case 0:
                    //System.out.println(java.util.Arrays.asList(Answerers1.values()));
                    for(int j = 0; j < AnswerersMassive1.length; j++) {
                        System.out.println(j+1 +". "+AnswerersMassive1[j]);
                    }
                    break;
                case 1:
                    for(int k = 0; k < AnswerersMassive2.length; k++) {
                        System.out.println(k+1 +". "+AnswerersMassive2[k]);
                    }
                    break;
                case 2:
                    for(int m = 0; m < AnswerersMassive3.length; m++) {
                        System.out.println(m+1 +". "+AnswerersMassive3[m]);
                    }
                    break;
                default:
                    System.out.println("Exception in showing answerer options");
            }

            //Выбор варианта ответа
            System.out.print("Ваш ответ (укажите цифрой вариант овтета): ");
            char ourAnswer = scanner.next().charAt(0);

            //Проверяем ответ и выводим результат
            //а также увеличиваем счетчики правильных и неправильных ответов
            //if (correctAnswers[i].equals(ourAnswer) || correctAnswersAlt[i].equals(ourAnswer)) {
            if (correctAnswers[i] == ourAnswer) {
                correctCount = correctCount +1;
                System.out.println("Верно!\n");
            } else {
                wrongCount = wrongCount + 1;
                System.out.println("Неверно!\n");
            }
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    //Списки ответов
    public enum Answerers1 {
        A("1147"),
        B("1703"),
        C("1812"),
        D("1917");
        private String displayName;

        Answerers1(String displayName) {
            this.displayName = displayName;
        }

        public String displayName() { return displayName; }

        // Optionally and/or additionally, toString.
        @Override public String toString() { return displayName; }
    }
    public enum Answerers2 {
        Ташкент, Душанбе, Бишкек, Ашхабад;
    }

    public enum Answerers3 {
        Gretzky("Уэйн Гретцки"),
        Howe("Горди Хоу"),
        Jagr("Яромир Ягр"),
        Hull("Бретт Халл");

        private String displayName;

        Answerers3(String displayName) {
            this.displayName = displayName;
        }

        public String displayName() { return displayName; }

        // Optionally and/or additionally, toString.
        @Override public String toString() { return displayName; }
    }
}