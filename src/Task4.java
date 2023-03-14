import java.util.Scanner;

public class Task4 {
    public void task4(Scanner scan) {
        System.out.println("Введіть значення x ");
        int x = scan.nextInt();
        System.out.println("Введіть значення y ");
        int y = scan.nextInt();
        int product = 0;
        for (int i = 1; i <= y; i++) {
            product += x;
        }
        System.out.println("Добуток чисел " + x + " і " + y + " дорівнює " + product);
    }
}
