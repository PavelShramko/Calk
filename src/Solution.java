import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        System.out.print("Чтобы начать - введите \"1\", чтобы закончить - введите \"0\".");
        Scanner num = new Scanner(System.in);
        int St;
        St = num.nextInt();

        while (St == 1) {

            System.out.println("Введите два числа, с которыми хотите произвести операцию");

            double a;
            double b;
            a = num.nextInt();
            b = num.nextInt();
            System.out.println("Введите номер операции, которую хотите осуществить с числами:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");

            int f;
            f = num.nextInt();

            if (f == 1) {
                double r = a + b;
                System.out.println("Ответ равен: " + r);
            } else if (f == 2) {
                double r = a - b;
                System.out.println("Ответ равен: " + r);
            } else if (f == 3) {
                double r = a * b;
                System.out.println("Ответ равен: " + r);
            } else if (f == 4) {
                double r = a / b;
                System.out.println("Ответ равен: " + r);
            } else if (f != 1 || f != 2 || f != 3 || f != 4) {
                System.out.println("Вы ввели не корректное значение");
            }
            System.out.println("Если хотите продолжить- введите \"1\", чтобы закончить - введите \"0\".");
            St = num.nextInt();

        }
        System.out.println("Вы завершили расчеты.");
    }
}