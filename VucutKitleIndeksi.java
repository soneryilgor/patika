import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		
		double boy, kilo,total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
		boy = scan.nextDouble();
		System.out.println("Lütfen Kilonuzu Giriniz : ");
		kilo = scan.nextDouble();
		
		if(boy>0 && kilo>0) {
			total =kilo/(boy*boy);
			System.out.println("Vücut Kitle Endeksiniz : " + total);
		}
		else {
			System.out.println("Kilo veya boyunuz 0 yada daha küçük olamaz!");
		}
	}

}
