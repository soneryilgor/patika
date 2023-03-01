import java.util.Scanner;

public class EnKucukEnBuyuk {

	public static void main(String[] args) {
		int buyuk=0,kucuk=0,n2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç Sayı Gireceksiniz : ");
		int n1=scan.nextInt();
		for(int i=1; i<=n1;i++) {
			System.out.print(i+". Sayıyı Giriniz : ");
			n2=scan.nextInt();
			
			if(n2>buyuk) {buyuk=n2;}
			if(n2<kucuk) {kucuk=n2;}
			
		}
		
		System.out.println("En büyük sayı : "+buyuk);
		System.out.println("En küçük sayı : "+kucuk);
		
		scan.close();
	}

}
