import java.util.Scanner;

public class Task7 {
    public void task7(Scanner scan) {
        System.out.println("Введіть значення n ");
        int n = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += 1 + i + i; // додаємо до суми вираз 1 + i + j            }

        }

        System.out.println("Сума виразу для всіх значень i та j від 1 до " + n + " дорівнює " + sum);

    }
}


