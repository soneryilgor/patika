import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = scan.nextInt();
        
        if(year%4==0 && year%100!=0 || year%400==0  ) {
        	System.out.println(year +" bir artık yıldır !");
        }else {
        	System.out.println(year +" bir artık yıl değildir !");
        }
		scan.close();
	}

}
