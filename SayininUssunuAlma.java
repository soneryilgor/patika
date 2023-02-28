import java.util.Scanner;

public class SayininUssunuAlma {

	public static void main(String[] args) {
		int taban,ust,toplam=1;
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        taban = scan.nextInt();
        System.out.print("Üssü Giriniz : ");
        ust = scan.nextInt();
        
        for(int i=1;i<=ust; i++ ) {
        	toplam*=taban;
        }
        System.out.println("Cevap : "+toplam);
	}

}
