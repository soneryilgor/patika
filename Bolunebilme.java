import java.util.Scanner;

public class Bolunebilme {

	public static void main(String[] args) {
		int toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz : ");
		int sayi=scan.nextInt();
		
		for (int i = 0; i<=sayi;i++) {
			if(i%3==0 || i%4==0) {
				toplam = toplam + i;
			} 
		}
		System.out.println(toplam);
	}

}
