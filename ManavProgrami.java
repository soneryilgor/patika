import java.util.Scanner;

public class ManavProgrami {

	public static void main(String[] args) {
		
	double armut=2.14, elma= 3.67,domates=1.11, muz=0.95,patlican=5,total;
	int armutkg,elmakg,domateskg,muzkg,patlicankg;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Armut Kaç Kilo? : ");
	armutkg= scan.nextInt();
	System.out.print("Elma Kaç Kilo? : ");
	elmakg= scan.nextInt();
	System.out.print("Domates Kaç Kilo? : ");
	domateskg= scan.nextInt();
	System.out.print("Muz Kaç Kilo? : ");
	muzkg= scan.nextInt();
	System.out.print("Patlıcan Kaç Kilo? : ");
	patlicankg= scan.nextInt();
	
	total=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
	
	System.out.println("Toplam Tutar : " + total+" TL");
	scan.close();
	}
}
