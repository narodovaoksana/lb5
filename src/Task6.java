import java.util.Scanner;

public class Task6 {
    public void task6 (Scanner scan) {
        System.out.println("Введіть значення a");
        int a_6 = scan.nextInt();

        System.out.println("Введіть значення b");
        int b_6 = scan.nextInt();

        int count1 = 0; // лічильник чисел, які задовольняють умову 1
        int count2 = 0; // лічильник чисел, які задовольняють умову 2

        for (int i = a_6; i <= b_6; i++) {

            if (i % 3 == 0 && i % 5 != 0) { // перевіряємо, чи є число кратним 3 і не кратним 5
                count1++; // збільшуємо лічильник чисел, які задовольняють умову 1

            }
            if (i % 2 == 0 && Math.sqrt(i) % 1 == 0) { // перевіряємо, чи є число квадратом парного числа

                count2++; // збільшуємо лічильник чисел, які задовольняють умову 2
            }

        }

        System.out.println("Кількість чисел, кратних 3 і не кратних 5: " + count1);
        System.out.println("Кількість чисел, які є квадратами парних чисел: " + count2);
    }
}