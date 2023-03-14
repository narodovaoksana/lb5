import java.util.Scanner;

public class Task1 {
    public void task1(Scanner scan) {
        System.out.println("Enter a, a>15");
        int a = scan.nextInt();
        if (a <= 15) {
            System.out.println("Помилка: a має бути більше 15");
        } else {
            for (int i = a; i >= 10; i--) {
                if (i % 2 != 0) {
                    System.out.println(i * i);
                }
            }
        }
    }
}
