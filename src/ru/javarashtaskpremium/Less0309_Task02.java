package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Less0309_Task02 {
    /* Введи с клавиатуры имя и возраст. Если возраст меньше 18, выведи надпись: «Подрасти еще».

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18, вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18, ничего не выводить. */

    public static void main(String[] args) throws Exception {
        BufferedReader myinp = new BufferedReader(new InputStreamReader(System.in));
        String mufam = myinp.readLine();
        int muage = Integer.parseInt(myinp.readLine());

        if (muage < 18) System.out.println("Подрасти еще");

    }
}
