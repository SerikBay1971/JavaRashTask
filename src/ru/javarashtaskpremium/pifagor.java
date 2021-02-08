package ru.javarashtaskpremium;

public class pifagor {
    public static void main(String[] args) {
        int z;
        int y = 1;
        while (y <= 9) {
            int x = 1;
            if (y == 2) System.out.println("  ---------------------------");
            while (x <= 9) {
                z = x * y;
                if (x == 2) System.out.print(" |");
                if (z == 1) System.out.print("   ");
                if (z > 1 && z < 10) System.out.print("  " + z);
                if (z >= 10 && z < 100) System.out.print(" " + z);
                x++;
            }
            System.out.println();
            y++;
        }
    }
}