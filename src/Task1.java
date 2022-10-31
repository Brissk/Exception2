import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        num();
    }

    static void num() {
        Scanner in = new Scanner(System.in);
        Double ab;
        while (true) {
            System.out.println("Введите вещественное число");
            if (in.hasNextDouble()) {
                ab = in.nextDouble();
                System.out.println("Вы ввели: " + ab);
                break;
            } else {
                System.out.println("Не верно");
                in.nextLine();
            }
        }
        in.close();
    }
}

