package HW1;

import java.util.Scanner;

public class Lession_4_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }
}