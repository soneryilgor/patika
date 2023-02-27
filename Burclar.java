import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		
		int s1,s2,s3,buyuk,kucuk;
		boolean isError=false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Doğduğunuz Ayı Giriniz : ");
		s1 = scan.nextInt();
		
		System.out.print("Doğduğunuz Günü Giriniz : ");
		s2 = scan.nextInt();
		
		if(s1==1) {
			if(s2>=0 && s2<=31) {
				if(s2<22) {
					System.out.println(" Oğlak Burcusunuz.");
				}else {
					System.out.println(" Kova Burcusunuz.");
				}
			}else {isError =true;}	
		}
		if(s1==2) {
			if(s2>=0 && s2<=28) {
				if(s2<20) {
					System.out.println(" Kova Burcusunuz.");
				}else {
					System.out.println(" Balık Burcusunuz.");
				}
			}else {isError =true;}	
		}
		if(s1==3) {
			if(s2>=0 && s2<=31) {
				if(s2<21) {
					System.out.println(" Balık Burcusunuz.");
				}else {
					System.out.println(" Koç Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==4) {
			if(s2>=0 && s2<=30) {
				if(s2<21) {
					System.out.println(" Koç Burcusunuz.");
				}else {
					System.out.println(" Boğa Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==5) {
			if(s2>=0 && s2<=31) {
				if(s2<22) {
					System.out.println(" Boğa Burcusunuz.");
				}else {
					System.out.println(" İkizler Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==6) {
			if(s2>=0 && s2<=30) {
				if(s2<23) {
					System.out.println(" İkizler Burcusunuz.");
				}else {
					System.out.println(" Yengeç Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==7) {
			if(s2>=0 && s2<=31) {
				if(s2<23) {
					System.out.println(" Yengeç Burcusunuz.");
				}else {
					System.out.println(" Aslan Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==8) {
			if(s2>=0 && s2<=31) {
				if(s2<23) {
					System.out.println(" Aslan Burcusunuz.");
				}else {
					System.out.println(" Başak Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==9) {
			if(s2>=0 && s2<=30) {
				if(s2<23) {
					System.out.println(" Başak Burcusunuz.");
				}else {
					System.out.println(" Terazi Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==10) {
			if(s2>=0 && s2<=31) {
				if(s2<23) {
					System.out.println(" Terazi Burcusunuz.");
				}else {
					System.out.println(" Akrep Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==11) {
			if(s2>=0 && s2<=30) {
				if(s2<22) {
					System.out.println(" Akrep Burcusunuz.");
				}else {
					System.out.println(" Yay Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1==12) {
			if(s2>=0 && s2<=31) {
				if(s2<22) {
					System.out.println(" Yay Burcusunuz.");
				}else {
					System.out.println(" Oğlak Burcusunuz.");
				}
			}else {isError =true;}		
		}
		if(s1>12 || s1<1) {isError =true;}
		if (isError) {System.out.println("Hatalı bir giriş yaptınız!");		}
	}

}
