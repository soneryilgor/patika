import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		int s1,s2,s3,buyuk,kucuk;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz : ");
		s1 = scan.nextInt();
		
		System.out.print("2. Sayıyı Giriniz : ");
		s2 = scan.nextInt();
		
		System.out.print("3. Sayıyı Giriniz : ");
		s3 = scan.nextInt();
		
		buyuk=s1;
		
		if(s2>buyuk) {
			buyuk = s2;
		
			if(s3>buyuk) {
			buyuk=s3;
				if( s1>s2) {
					System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s3 + " > "+ s1 + " > "+ s2);
				}else {
					System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s3 + " > "+ s2 + " > "+ s1);
				}
			}else {
				if( s1>s3) {
					System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s2 + " > "+ s1 + " > "+ s3);
				}else {
					System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s2 + " > "+ s3 + " > "+ s1);
				}
			}
		}else {
			if( s2>s3) {
				System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s1 + " > "+ s2 + " > "+ s3);
			}else {
				System.out.println("Büyükten Küçüğe Girilen Sayılar : "+ s1 + " > "+ s3 + " > "+ s2);
			}
		}
	}

}
