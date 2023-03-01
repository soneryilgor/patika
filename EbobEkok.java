import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int buyuk,kucuk,ebob=1,ekok=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci Sayıyı Giriniz : ");
		int n1=scan.nextInt();
		System.out.print("İkinci Sayıyı Giriniz : ");
		int n2=scan.nextInt();
		
		if(n1>n2) {buyuk=n1;kucuk=n2;}
		else {buyuk=n2;kucuk=n1;} 
		
		int k= 1;
		while(k<=kucuk) {
			if(n1%k==0 && n2%k==0)
			ebob=k;
			k++;
		}
		System.out.println("Ebob : "+ebob);
		ekok=(n1*n2)/ebob;
		System.out.println("Ekok : "+ekok);
		
		scan.close();
	}

}
