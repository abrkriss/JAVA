package Lesson_1;

import java.util.Scanner;

public class Les1_t3 {
    public static void main(String[] args) {
        double res = 0;
        char op;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double a = iScanner.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double b = iScanner.nextDouble();
        iScanner.close();
        switch(op) {
            case '+': res = a + b;
               break;
            case '*': res = a * b;
               break;
            case '-': res = a - b;
               break;
            case '/': res = a / b;
               break;
            default:  System.out.printf("Некорректные данные");
               return; 
    }
    System.out.printf(a + " " + op + " " + b + " = " + res);
}
}
