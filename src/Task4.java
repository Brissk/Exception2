//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        nullSpace();
    }

    public static void nullSpace() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово");
        String s = in.nextLine();
        if (s.isBlank()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        } else {
            System.out.println("Good job");
        }


    }
}

