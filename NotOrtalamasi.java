import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, beden;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = scan.nextInt();

        System.out.print("Beden notunu giriniz : ");
        beden = scan.nextInt();

        float sonuc = ((mat + fizik + kimya + tarih + beden) / 5);

        System.out.println("Ortalama : " + sonuc);

        if (sonuc >= 60) {
            System.out.println("Sınıfı Geçti");
        } else if (sonuc < 60) {
            System.out.println("Sınıfta Kaldı");
        }

        scan.close(); 
    }
}