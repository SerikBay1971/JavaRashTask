package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0408_Task05 {
    /* Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.

    Пример вывода на экран для имени Света:
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.

            Требования:
            •	Программа должна считывать имя c клавиатуры.
            •	Программа должна выводить текст на экран.
            •	Программа должна выводить 10 раз текст, указанный в задании.
            •	В программе должен использоваться цикл for. */
    public static void main(String[] args) throws IOException {
        BufferedReader tuktuk = new BufferedReader(new InputStreamReader(System.in));
        String nammm = tuktuk.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(nammm + "  любит меня.");
        }
    }
}
