import java.util.Scanner;

public class DaireDilimiAlani {
	
	public static void main(String[] args) {
		
		double pi = 3.14, alan;
		int yaricap, alfa;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Yariçap giriniz : ");
		yaricap = scan.nextInt();
		System.out.println("Açı giriniz : ");
		alfa = scan.nextInt();
		
		if(yaricap>0 && alfa>0) {
			alan =(pi*(yaricap*yaricap)*alfa)/360;
			System.out.println("Açısı verilen dilimin alanı : " + alan);
		}
		else {
			System.out.println("Yariçap veya açı 0 ve daha küçük olamaz!");
		}
	
	}
	
}
