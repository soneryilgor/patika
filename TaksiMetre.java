import java.util.Scanner;

public class TaksiMetre{
	
    public static void main(String[] args) {

    	int km;
    	double perkm= 2.20 , acilis=10,sonuc;
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Kilometre Giriniz : ");
    	km= scan.nextInt();
    	
    	sonuc = acilis+(km*perkm);
    	sonuc =(sonuc<20) ? 20 : sonuc;
    	
    	System.out.println("Taksi Ücretiniz : " + sonuc);
    	scan.close();
    	
    }
    
}