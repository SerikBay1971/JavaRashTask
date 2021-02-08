package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Less0309_Task04 {
    /* Введи с клавиатуры два целых числа, которые будут координатами точки,
    не лежащей на осях OX и OY.
Выведи на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

для первой четверти - a>0 и b>0;
для второй четверти - a<0 и b>0;
для третьей четверти - a<0 и b<0;
для четвертой четверти - a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4" */

    public static void main(String[] args) throws Exception {
        BufferedReader readpoint = new BufferedReader(new InputStreamReader(System.in));
        int k1 = Integer.parseInt(readpoint.readLine());
        int k2 = Integer.parseInt(readpoint.readLine());

        if (k1 > 0 && k2 > 0) System.out.println(1);
        if (k1 < 0 && k2 > 0) System.out.println(2);
        if (k1 < 0 && k2 < 0) System.out.println(3);
        if (k1 > 0 && k2 < 0) System.out.println(4);

    }
}
