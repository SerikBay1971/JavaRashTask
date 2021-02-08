package ru.javarashtaskpremium;

public class pifagor {
    public static void main(String[] args) {
        int z;
        for (int y = 1; y <= 9; y++) {
            if (y == 2) System.out.println("  ---------------------------");
            for (int x = 1; x <= 9; x++) {
                z = x * y;
                if (x == 2) System.out.print(" |");
                if (z == 1) System.out.print("   ");
                if (z > 1 && z < 10) System.out.print("  " + z);
                if (z >= 10 && z < 100) System.out.print(" " + z);
            }
            System.out.println();
        }
    }
}