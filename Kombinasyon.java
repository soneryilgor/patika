import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		int sayi1,sayi2;
		int F1=1,F2=1,F3=1;
		
		Scanner scan = new Scanner(System.in);
        System.out.print("1. Kümenin Eleman Sayısını Giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("2. Kümenin Eleman Sayısını Giriniz : ");
        sayi2 = scan.nextInt();
        
        for (int i=1; i<=sayi1; i++) {F1*=i;}
        for (int j=1; j<=sayi2; j++) {F2*=j;}
        for (int k=1; k<=(sayi1-sayi2); k++) {F3*=k;}

        System.out.println("Kombinasyon : " + (F1/(F2*F3)));
	}

}
