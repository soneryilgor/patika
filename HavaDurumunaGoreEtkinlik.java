import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {

	public static void main(String[] args) {
		int heat;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Hava Sıcaklığını Giriniz : ");
		heat = scan.nextInt();
		
		if(heat<=5) {
			System.out.println("Kayağa Gidebilirsin");
		} else if (heat<=25){
				if(heat<=15) {
					System.out.println("Sinemaya Gidebilirsin");
				}
				if(heat>=10) {
					System.out.println("Pikniğe Gidebilirsin");
				}
		}else {
			System.out.println("Yüzmeye Gidebilirsin");
		}
		scan.close();
	}

}
