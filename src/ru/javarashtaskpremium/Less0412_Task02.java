package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0412_Task02 {
    /* Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить среднее из трех чисел.
•	Если все числа равны, вывести любое из них.
•	Если два числа из трех равны, вывести любое из двух. */
    public static void main(String[] args) throws IOException {
        BufferedReader vvod = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(vvod.readLine());
        int b = Integer.parseInt(vvod.readLine());
        int c = Integer.parseInt(vvod.readLine());
        int mid = 0;

        if ((a >= b && a <= c) || (a >= c && a <= b)) mid = a;
        if ((b >= a && b <= c) || (b >= c && b <= a)) mid = b;
        if ((c >= b && c <= a) || (c >= a && c <= b)) mid = c;

        System.out.println(mid);
    }
}
