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


  /* KDV Tutarı Hesaplayan Program
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
     /   Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak K */