import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayıyı Giriniz : ");
		int n1=scan.nextInt();
		
		for(int i=1;i<=n1;i++) {
			
			c=a+b;
			System.out.println(a+"+"+b+"="+c);
			a=b;
			b=c;
			
		}
		scan.close();
	}

}
