import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
	
	double n1,n2;
	int secim;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Birinci rakamı giriniz : ");
	n1=scan.nextInt();
	System.out.print("İkinci rakamı giriniz : ");
	n2=scan.nextInt();
	
	System.out.print("1-Toplama\n 2-Çıkartma\n 3-Çarpma\n 4-Bölme");
	System.out.print("Yapmak İstediğiniz İşlemin Sıra Numarasını Giriniz : ");
	secim=scan.nextInt();
	
	switch(secim) {
	 case 1:
		 System.out.println("Sonuç : "+(n1+n2));
		 break;
	 case 2:
		 System.out.println("Sonuç : "+(n1-n2));
		 break;
	 case 3:
		 System.out.println("Sonuç : "+(n1*n2));
		 break;
	 case 4:
		 System.out.println("Sonuç : "+(n1/n2));
		 break;
		}
		
	scan.close();
	}

}
