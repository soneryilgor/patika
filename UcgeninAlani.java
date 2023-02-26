import java.util.Scanner;

public class UcgeninAlani{
    public static void main(String[] args) {
    
    int a,b,c;
    double u,alan,alankare;

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Üçgenin 1. kenarını giriniz : ");
    a=scan.nextInt();

    System.out.print("Üçgenin 2. kenarını giriniz : ");
    b=scan.nextInt();

    System.out.print("Üçgenin 3. kenarını giriniz : ");
    c=scan.nextInt();

    u=(a+b+c) / 2;
    alankare =u * (u-a)* (u-b) * (u-c);
    
    alan= alankare/2;
    
    System.out.print("Üçgenin Alanı : " +alan);

    scan.close();

    }
}