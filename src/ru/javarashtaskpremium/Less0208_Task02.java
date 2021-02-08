package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0208_Task02 {
    /* Введи с клавиатуры отдельно Имя, число1, число2. Выведи надпись:
«Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число1.
•	Выведенный текст должен содержать введенное число2.
•	Выведенный текст должен полностью соответствовать заданию. */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge1 = reader.readLine();
        String sAge2 = reader.readLine();
        System.out.print(name + " получает " + sAge1 + " через " + sAge2 + " лет.");
    }
}
