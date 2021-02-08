package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Less0309_Task01 {
    /* Введи с клавиатуры два целых числа и выведи на экран минимальное из них.
    Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое. */

    public static void main(String[] args) throws Exception  {
        BufferedReader innumpls = new BufferedReader(new InputStreamReader(System.in));
        int numint1 = Integer.parseInt(innumpls.readLine());
        int numint2 = Integer.parseInt(innumpls.readLine());

        if (numint1 <= numint2)
            System.out.println(numint1);
        else
            System.out.println(numint2);
    }
}
