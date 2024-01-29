package org.example;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Создаем объект класса сканер для считывания вводных значений
        Scanner sc = new Scanner(System.in);
        // Создаем объект FileWriter для записи в файл "students.txt"
        FileWriter fileWriter = new FileWriter("students.txt");
        // Создаем объект BufferedWriter для буферизированной записи данных
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Основная информация о работе программы
        System.out.println("Введите информацию о студентах.");
        System.out.println("Для завершения работы программы введите '0'.");

        // Цикл ввода данных о студентах
        while (true) {

            // Ввод и запись в переменную имени студента
            System.out.print("Имя студента: ");
            String studentName = sc.nextLine();

            // Проверка на выход из цикла
            if (studentName.equalsIgnoreCase("0")) {
                break;
            }

            //Ввод и запись в переменную возраста студента
            System.out.print("Возраст студента: ");
            int studentAge = sc.nextInt();
            // Очищаем буфер после считывания числа
            sc.nextLine();

            // Проверка на выход из цикла
            if (studentAge <= 0) {
                break;
            }

            //Ввод и запись в переменную среднего балла студента
            System.out.print("Средний балл студента: ");
            double averageMark = sc.nextDouble();
            // Очищаем буфер после считывания числа
            sc.nextLine();

            // Проверка на выход из цикла
            if (averageMark <= 0.0) {
                break;
            }

            // Записываем информацию о студенте в файл
            bufferedWriter.write(("Имя студента: " + studentName + "\nВозраст студента: " + studentAge +
                    "\nСредний балл студента: " + averageMark + "\n"));
            // Переходим на новую строку для следующего студента
            bufferedWriter.newLine();
        }

        // Завершаем работу  BufferedWriter
        bufferedWriter.close();
        // Завершаем работу FileWriter
        fileWriter.close();

        // Сообщение об успешном выполнении работы программы
        System.out.println("Данные успешно записаны в файл 'students.txt'.");
    }
}
