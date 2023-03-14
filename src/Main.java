import java.util.Scanner;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","6","7"};
                while (true){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       if (s.equals("1")){
           Task1 task1 = new Task1();
           task1.task1(scan);
       } else if (s.equals("2")){
                        Task2 task2 = new Task2();
                        task2.task2(scan);

       }else if (s.equals("3")){
           Task3 task3 = new Task3();
           task3.task3(scan);

       } else if (s.equals("4")){
           Task4 task4 = new Task4();
           task4.task4(scan);

       } else if (s.equals("5")){
           Task5 task5 = new Task5();
           task5.task5(scan);

       } else if (s.equals("6")){
           Task6 task6 = new Task6();
           task6.task6(scan);

       }else if (s.equals("7")){
           Task7 task7 = new Task7();
           task7.task7(scan);

       }
       else
           System.exit(0);

                }}}