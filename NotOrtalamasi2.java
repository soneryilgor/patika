import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, beden;
        double toplam=0,ders=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = scan.nextInt();
        if(mat<=100 && mat>=0) {
        	toplam=toplam+mat;
        	++ders;
        }

        System.out.print("Fizik notunu giriniz : ");
        fizik = scan.nextInt();
        if(fizik<=100 && fizik>=0) {
        	toplam=toplam+fizik;
        	++ders;
        }

        System.out.print("Kimya notunu giriniz : ");
        kimya = scan.nextInt();
        if(kimya<=100 && kimya>=0) {
        	toplam=toplam+kimya;
        	++ders;
        }

        System.out.print("Tarih notunu giriniz : ");
        tarih = scan.nextInt();
        if(tarih<=100 && tarih>=0) {
        	toplam=toplam+tarih;
        	++ders;
        }

        System.out.print("Beden notunu giriniz : ");
        beden = scan.nextInt();
        if(beden<=100 && beden>=0) {
        	toplam=toplam+beden;
        	++ders;
        }
        
        System.out.println("ortalamaya katılan ders sayısı : "+ ders);
        System.out.println("ortalamaya katılan derslerin toplam notu : "+toplam);
        double sonuc = (toplam / ders);

        if (sonuc >= 55) {
            System.out.println("Tebrikler, Sınıfı Geçtiniz!");
        } else {
            System.out.println("Üzgünüm Sınıfta Kaldınız!");
        }
        	System.out.println("Ortalamanız : "+sonuc);
        scan.close(); 
    }
}