package RecursiveIleAsalSayiBulma;

import java.util.Scanner;

public class AsalsayiBulma {
    public static boolean asalMi(int sayi, int a) {
        if (a == 1) {
            return true;
        } else if (sayi % a == 0) {
            return false;
        } else {
            return asalMi(sayi, a - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = sc.nextInt();

        if (asalMi(sayi, sayi/2)) {
            System.out.println(sayi + " Asal Sayıdır.");
        } else {
            System.out.println(sayi + " Asal Değildir.");
        }
        sc.close();
    }
}
