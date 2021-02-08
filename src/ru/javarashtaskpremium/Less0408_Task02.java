package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0408_Task02 {
    /* Введи с клавиатуры два числа - m и n.
Используя цикл for, выведи на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник размером m на n из восьмёрок.
•	В программе должен использоваться цикл for. */
    public static void main(String[] args) throws IOException {
        BufferedReader sikoka = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(sikoka.readLine()); //кол-во строк
        int n = Integer.parseInt(sikoka.readLine()); //кол-во столбцов
        for ( ; m > 0; m--) {
            for (int n1 = n ; n1 >0 ; n1--) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
