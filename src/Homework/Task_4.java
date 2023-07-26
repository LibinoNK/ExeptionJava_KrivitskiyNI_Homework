// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Homework;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            String word = input();
            System.out.println("Вы ввели слово " + word);

        } catch (NullPointerException ex) {
            System.err.println("Введена пустая строка!");
        }
    }

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cлово: ");
        String word = scanner.nextLine();
        if(word.equals("") || word.equals(" ")){throw new NullPointerException();}
        scanner.close();
        return word;
    }
}