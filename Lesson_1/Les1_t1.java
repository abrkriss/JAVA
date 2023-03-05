package Lesson_1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  а так же n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class Les1_t1{
    public static void main (String[] args) {
        int s = 1;
        int res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        iScanner.close();
        res = number * (number + 1)/2;
        System.out.printf(" Введено число: " + number + " Сумма от 1 до " + number + " = " + res + "\n");
        for (int i = 1; i <= number; i++) {
            s = s*i;
        }
        System.out.printf(" Введено число: " + number + "  Произведение от 1 до " + number + " = " + s);
    }   
}