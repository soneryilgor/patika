import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		int total=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayıyı Giriniz : ");
		int n1=scan.nextInt();
		
		for(int i=1; i<=n1-1;i++) {
			if(n1%i==0) {
				total+=i;
			}			
		}
		if(total==n1) {
			System.out.println(n1+" Mükemmel Sayıdır");
		}else {
			System.out.println(n1+" Mükemmel Sayı Değildir");
		}
		scan.close();
	}

}
