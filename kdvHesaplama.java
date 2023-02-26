import java.util.Scanner;

public class kdvHesaplama{
    public static void main(String[] args) {

        int fiyat;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ürün Fiyatı giriniz : ");
        fiyat = scan.nextInt();

        if (fiyat<1001 && fiyat>=0){
            double kdv=0.18;
            double hesap= fiyat*kdv;
            double kdvlifiyat = fiyat+hesap;

        System.out.print("Ürün Kdv'li Fiyatı : " + kdvlifiyat);
        }
        else if(fiyat<0){
            System.out.print("Ürün Fiyatı Eksi Olamaz!");
        }
        else{
            double kdv=0.10;
            double hesap= fiyat*kdv;
            double kdvlifiyat = fiyat+hesap;

        System.out.print("Ürün Kdv'li Fiyatı : " + kdvlifiyat);
        }

        scan.close();
    }

}