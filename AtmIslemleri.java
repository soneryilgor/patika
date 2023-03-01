import java.util.Scanner;

public class AtmIslemleri {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();
                    switch(select){
                        case 1: System.out.print("Para miktarı : ");
                                int price = scan.nextInt();
                                balance += price;
                                System.out.println("Son Bakiyeniz : " + balance);
                                System.out.println("Tekrar görüşmek üzere.");
                                break;
                        case 2: System.out.print("Para miktarı : ");
                                int price2 = scan.nextInt();
                                if (price2 > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                balance -= price2;
                                System.out.println("Son Bakiyeniz : " + balance);
                                System.out.println("Tekrar görüşmek üzere.");
                                }break;
                        case 3: System.out.println("Bakiyeniz : " + balance);
                        break;
                        case 4:System.out.println("Tekrar görüşmek üzere.");
                        break;
                    }
                
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız : " + right);
                }
            }break;
        }scan.close();
    }  
}