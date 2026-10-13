package ru.ranepa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Student student = new Student(name);

        // читаем оценки, пока не введут 0
        int grade = scanner.nextInt();
        while (grade != 0) {
            student.addGrade(grade);
            grade = scanner.nextInt();
        }

        student.printReport();
    }
}