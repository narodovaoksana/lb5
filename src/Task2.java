import java.util.Scanner;

public class Task2 {
    public void task2(Scanner scan) {
        System.out.println("Введіть значення n ");
        int n = scan.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Введіть коректне значення  n");
        } else {
            for (int i = 1; i <= 9; i++) {
                System.out.println(i + " * " + n + " = " + (i * n));
            }
        }
    }
}
