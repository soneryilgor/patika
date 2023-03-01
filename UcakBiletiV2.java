import java.util.Scanner;

public class UcakBiletiV2 {
    public static void main(String[] args) {
        int yas, mesafe, yolculukTipi,km;
        double indirim, ekstra,ucret, kmUcret=0.30;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz : ");
        yas = scan.nextInt();
        System.out.print("Uçuş Mesafeleri\nistanbul->ankara=1\nistanbul->antalya=2\nistanbul->adana=3\nistanbul->sivas=4\nistanbul->izmir=5\nistanbul->erzurum=6\nistanbul->van=7\nistanbul->trabzon=8\n");
        System.out.print("Uçuş Mesafesi Seçiniz : ");
        mesafe = scan.nextInt();
        System.out.print("Uçuş Tipi:\n Gidiş Dönüş-1\n Tek Yön-2\n");
        System.out.print("Yolculuk Tipi Giriniz : ");
        yolculukTipi = scan.nextInt();

            if(yas>12){indirim=0.5;}else if(yas>=12 && yas<=25){indirim=0.9;}else if(yas>65){indirim=0.7;}else{indirim=1;}
            if(yolculukTipi==1){ekstra=0.80;}else{ekstra=1;}

        switch (mesafe){
            case 1 :km=351;ucret=km*indirim*ekstra*kmUcret;
                    System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 2 :km=481;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 3 :km=708;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 4 :km=695;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 5 :km=320;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 6 :km=1040;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 7 :km=1261;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
            case 8 :km=895;ucret=km*indirim*ekstra*kmUcret;
                System.out.println("Bilet Ücretiniz : "+ucret);break;
        }
        scan.close();
    }
}
