package ru.javarashtaskpremium;

public class Less0408_Task03 {
    /* Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
•	В программе должен использоваться цикл for. */
    public static void main(String[] args) {
        int strok = 10;
        int stolbc = 1;
        for (int ryd = 1; ryd <= strok; ryd++) {
            for (int vis = 1; vis <= stolbc; vis++) {
                System.out.print("8");
            }
            System.out.println();
            stolbc++;
        }
    }
}
