import java.util.Scanner;

public class BasamakSayiToplami {

	public static void main(String[] args) {
		int sayi,kalan=0,result=0;;

		Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        sayi = scan.nextInt();

        while(sayi!=0) {
        		
        		kalan=sayi%10;
        		sayi/=10;
        		result+=kalan;
        }
        System.out.println("Sonuç : "+result);
        scan.close();
	}

}
