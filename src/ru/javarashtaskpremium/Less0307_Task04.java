package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Less0307_Task04 {
    /* Введи с клавиатуры номер дня недели. Далее, в зависимости от номера,
    выведи одно из названий: «понедельник», «вторник», «среда», «четверг»,
    «пятница», «суббота», «воскресенье».
    Если введен номер больше 7 или меньше 1, выведи «такого дня недели не существует».

    Пример для номера 5:
    пятница

    Пример для номера 10:
    такого дня недели не существует

    Требования:
    •	Программа должна считывать число c клавиатуры.
    •	Программа должна выводить текст на экран.
    •	Если введено число от 1 до 7, необходимо вывести день недели.
    •	Если введено число, не входящее в интервал от 1 до 7, то вывести уведомление,
    что такого дня недели не существует. */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int dayN = Integer.parseInt(input.readLine());
        String dayS = "Такого дня недели не существует";

        if (dayN >= 1 && dayN <= 7) {
            if (dayN == 1)
                dayS = "понедельник";
            if (dayN == 2)
                dayS = "вторник";
            if (dayN == 3)
                dayS = "среда";
            if (dayN == 4)
                dayS = "четверг";
            if (dayN == 5)
                dayS = "пятница";
            if (dayN == 6)
                dayS = "суббота";
            if (dayN == 7)
                dayS = "воскресенье";
        }

        System.out.println(dayS);
    }
}
