import java.util.Scanner;

public class SayininKuvvetleri {

	public static void main(String[] args) {
		int sayi;
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = scan.nextInt();
        
        for(int i=1; i<=sayi; i*=4) {
        	System.out.print(i+" ");
        }
        System.out.println("\n---------");
        for(int i=1; i<=sayi; i*=5) {
        	System.out.print(i+" ");
        }
        scan.close();
	}

}
