import java.util.Scanner;

public class Task5 {
    public void task5(Scanner scan) {
        System.out.println("Введіть значення n");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Введіть коректне значення n, n - натуральне. ");

        } else {

            int result_5 = 0;
            for (int i = 1; i <= 2 * n - 1; i += 2) {

                result_5 += i;
            }

            System.out.println(n + "^2 = " + result_5);
        }
    }
}
