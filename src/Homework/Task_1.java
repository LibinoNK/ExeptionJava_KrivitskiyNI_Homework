//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        number();
    }

    public static void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!scanner.hasNextFloat()){
            System.err.println("Некорректное значение! Введите дробное число: ");
            scanner.next();
        }
        float number = scanner.nextFloat();
        scanner.close();
        System.out.println("Введенное число: " + number);
    }
}
