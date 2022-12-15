import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму пополнения баланса: ");
        int addBalance = scan.nextInt();

        int balance = 100; // Начальный баланс
        int bonus = 0; // Переменная для записи количества бонусов

        // Расчёт количества бонусных рублей за пополнение
        if (addBalance >= 1000) {
            bonus = bonus + addBalance / 100;
            balance = addBalance / 100 + addBalance + balance;
        } else {
            balance = balance + addBalance;
        }

        System.out.println("Вы пополнили баланс на сумму: " + addBalance + "." + " Вам начисленно: " + bonus + " бонусных рублей");
        System.out.println("Ваш текущий баланс: " + balance);
    }
}
