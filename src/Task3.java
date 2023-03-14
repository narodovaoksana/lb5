import java.util.Scanner;

public class Task3 {
    public void task3(Scanner scan) {
        System.out.print("Введіть значення a: ");
        int a = scan.nextInt();
        System.out.print("Введіть значення b: ");
        int b = scan.nextInt();
        System.out.print("Введіть значення кроку h: ");
        int h = scan.nextInt();
        if (h < 0) {
            System.out.println("Введіть коректне значення h ");
        } else {
            int sum = 0;
            int count = 0;
            for (int i = a; i <= b; i += h) {
                sum += i;
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Середнє арифметичне всіх чисел від " + a + " до " + b + " з кроком " + h + " дорівнює " + average);
        }
    }
}
