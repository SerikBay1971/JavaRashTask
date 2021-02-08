package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0208_Task01 {
    /* Введи с клавиатуры имя и число, а затем выведи на экран строку: Через «число» лет «имя» захватит мир. Му-ха-ха!

Пример:
Через 8 лет Вася захватит мир. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число.
•	Выведенный текст должен полностью соответствовать заданию. */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Имя? ");
        String name = reader.readLine();
        // System.out.println();
        // System.out.print("Срок? ");
        String sAge = reader.readLine();
        // System.out.println();
        System.out.print("Через " + sAge + " лет " + name + " захватит мир. Му-ха-ха!");
    }
}
