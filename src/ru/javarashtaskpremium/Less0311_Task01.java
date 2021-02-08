package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Less0311_Task01 {
    /* Введи с клавиатуры целое число. Выведи на экран его строку-описание следующего вида:

«отрицательное четное число» - если число отрицательное и четное;
«отрицательное нечетное число» - если число отрицательное и нечетное;
«ноль» - если число равно 0;
«положительное четное число» - если число положительное и четное;
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если число отрицательное и четное, вывести "отрицательное четное число".
•	Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
•	Если число равно 0, вывести "ноль".
•	Если число положительное и четное, вывести "положительное четное число".
•	Если число положительное и нечетное, вывести "положительное нечетное число". */

    public static void main(String[] args) throws Exception {
        BufferedReader vvediplz = new BufferedReader(new InputStreamReader(System.in));
        int proverka = Integer.parseInt(vvediplz.readLine());

        String pol_otr = "";
        String chet_no = "";

        if (proverka > 0)
            pol_otr = "положительное";
        if (proverka < 0)
            pol_otr = "отрицательное";
        if ((proverka % 2) == 0)
            chet_no = "четное";
        else chet_no = "нечетное";


        String zakluch;
        if (proverka == 0)
            zakluch = "ноль";
        else
            zakluch = pol_otr + " " + chet_no + " число";

        System.out.println(zakluch);
    }
}
