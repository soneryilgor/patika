import java.util.Scanner;

public class CiftSayiGirisVeToplami {

	public static void main(String[] args) {
		
		int sayi, toplam=0;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.print("Sayı Giriniz : ");
		sayi=scan.nextInt();
		
		if(sayi%4==0) {
			toplam += sayi;
		}
		}while (sayi%2==0);
		
		System.out.println("Girilen Sayılardan 4 ve 4'ün katı olan sayıların toplamı : " + toplam);
	}

}
