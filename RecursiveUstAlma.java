import java.util.Scanner;

public class RecursiveUstAlma {
    
    static int recursivePower(int taban, int us){
    
        if( us == 0){
            return 1;
        } else if (us == 1) {
            return taban;
        }
            return taban * recursivePower(taban, (us-1));
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Taban değerini giriniz : ");
        int taban = scan.nextInt();
    
        System.out.print("Üs değerini giriniz : ");
        int us = scan.nextInt();
    
        System.out.println(recursivePower(taban,us));
        
        scan.close();
    }
    
}
