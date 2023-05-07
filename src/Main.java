// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kdvsizFiyat, kdvOrani, kdvliTutar, kdvTutari;
        System.out.print("Lütfen fiyatı giriniz: ");
        kdvsizFiyat = sc.nextDouble();
        if (kdvsizFiyat >= 1000)
            kdvOrani = 0.08;
        else
            kdvOrani = 0.18;
        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliTutar = kdvsizFiyat + kdvTutari;
        System.out.println("kdvsizFiyat = " + kdvsizFiyat);
        System.out.println("kdvOrani = " + kdvOrani);
        System.out.println("kdvTutari = " + kdvTutari);
        System.out.println("kdvliTutar = " + kdvliTutar);
    }
}


