package ru.javarashtaskpremium;

public class Less0405_Task04 {
    /* Выведи на экран квадрат из 10х10 букв S, используя цикл while. Буквы в каждой строке не разделяй пробелами.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить квадрат из 10х10 букв S.
•	В программе должен использоваться цикл while. */
    public static void main(String[] args) {
        String s = "S";

        int y = 10;
        while (y > 0) {
            int x = 10;
            while (x > 0) {
                System.out.print(s);
                x--;
            }
            System.out.println();
            y--;
        }
    }
}
