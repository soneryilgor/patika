import java.util.Scanner;

public class PalindromSayilar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz : ");
		int number=scan.nextInt();
		
		isPalidrom(number);
		if(isPalidrom(number)==true) {
			System.out.println(number+" Palindrom Sayıdır");
		}else {
			System.out.println(number + " Palindrom Sayı Değildir");
		}
		
		scan.close();
	}
	static boolean isPalidrom(int number) {
		int temp=number,reverseNumber=0,lastNumber=1;
		
		while(temp!=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp=temp/10;
		}
		if(number==reverseNumber) { 
			return true;
		}else {
			return false;
			}
		
	}

}
