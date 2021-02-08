package ru.javarashtaskpremium;

import java.util.Scanner;

public class Less0307_Task03 {
    /* Введи с клавиатуры число. Если число положительное, увеличь его в два раза. Если число отрицательное, прибавь единицу.
    Если введенное число равно нулю, выведи число ноль.
    Выведи результат на экран.

    Требования:
            •	Программа должна считывать число c клавиатуры.
            •	Программа должна выводить число на экран.
            •	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
            •	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
            •	Если введенное число равно нулю, необходимо вывести число ноль. */
    public static void main(String[] args) throws Exception {
        Scanner keybrd = new Scanner(System.in);
        int indium1 = keybrd.nextInt();


        if (indium1 > 0)
            indium1 = indium1 * 2;

        if (indium1 < 0)
            indium1 = indium1 + 1;

        System.out.println(indium1);

    }
}
