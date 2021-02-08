package ru.javarashtaskpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less0405_Task03 {
    /* Введи с клавиатуры строку и число N больше 0.
Выведи на экран строку N раз, используя цикл while. Каждое значение - с новой строки.

Пример ввода:
абв
2
Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while. */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        int cont = Integer.parseInt(input.readLine());
        while (cont > 0) {
            System.out.println(line);
            cont = cont - 1;
        }
    }
}
