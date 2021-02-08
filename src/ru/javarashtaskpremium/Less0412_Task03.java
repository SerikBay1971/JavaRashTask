package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0412_Task03 {
    /* Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи - использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
break;
}

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
•	Программа должна посчитать сумму введенных чисел и вывести её на экран.
•	В программе должен использоваться цикл for, while или do-while. */
    public static void main(String[] args) throws IOException {
        BufferedReader vvodite = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int summ = 0;

        while (true) {
            num = Integer.parseInt(vvodite.readLine());
            summ = summ + num;
            if (num == -1)
                break;
        }
        System.out.println(summ);
    }
}
