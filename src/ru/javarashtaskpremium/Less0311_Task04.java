package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0311_Task04 {
    /* Введи с клавиатуры три целых числа. Выведи на экран количество положительных и отрицательных чисел в исходном наборе в следующем виде:
"количество отрицательных чисел: а"
"количество положительных чисел: б"
где а, б - искомые значения.

Примеры:
а) при вводе чисел:
2
5
6
получим вывод:
количество отрицательных чисел: 0
количество положительных чисел: 3

б) при вводе чисел:
-2
-5
6
получим вывод:
количество отрицательных чисел: 2
количество положительных чисел: 1
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить количество отрицательных чисел в исходном наборе.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
•	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
•	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам. */
    public static void main(String[] args) throws IOException {
        BufferedReader suda = new BufferedReader(new InputStreamReader(System.in));

        int a = 0; // счетчик отрицательных чисел
        int b = 0; // счетчик положительных чисел

        for (int kolch = 0; kolch < 3; kolch++) {
            int tr_ch = Integer.parseInt(suda.readLine());
            if (tr_ch < 0) a++;
            if (tr_ch > 0) b++;
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);
    }
}
