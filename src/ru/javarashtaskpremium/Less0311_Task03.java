package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0311_Task03 {
    /* Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел
    среди этих трех.

Примеры:
а) при вводе чисел:
-4
6
6
получим вывод:
2

б) при вводе чисел:
-6
-6
-3
получим вывод:
0

в) при вводе чисел:
0
1
2
получим вывод:
2 */
    public static void main(String[] args) throws IOException {
        BufferedReader three_num = new BufferedReader(new InputStreamReader(System.in));
        int sct = 0;
        for (int l = 0; l < 3; l++) {
            int ct_nct = Integer.parseInt(three_num.readLine());
            if (ct_nct > 0) sct++;
        }
        System.out.println(sct);
    }
}
