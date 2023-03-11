package DeseneGoreMetotOlusturma;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    public static void sayiCikart(int sayi){
        
        int yeniSayi=sayi;
        System.out.print("Çıktısı : "+sayi+" ");
        for(int i=sayi;i>0;i=i-5){
        
            yeniSayi-=5;
            System.out.print(yeniSayi+" ");
            
        }
        int sonSayi=yeniSayi; 

        for(int i =sonSayi; i<sayi;i+=5){
            sonSayi+=5;
            System.out.print(sonSayi+" ");
        }
    }   
    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısını girin: ");
        int sayi = sc.nextInt();

        System.out.println("N sayısı: "+ sayi);
        sayiCikart(sayi);

        sc.close();
    }
}
