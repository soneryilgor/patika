import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String kullaniciAdi,sifre,sor;
		String giris1,sifre1,degis,yeniSifre;
		
		kullaniciAdi="Soner";
		sifre="1453";
		sor="E";
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adını Giriniz : ");
		giris1=scan.nextLine();
		System.out.print("İkinci rakamı giriniz : ");
		sifre1=scan.nextLine();
		
		if(kullaniciAdi.equals(giris1) && sifre.equals(sifre1)) {
			System.out.println("Kullanıcı Girişi Başarılı");
		}else {
			System.out.println("Kullanıcı Girişi Başarısız");
			System.out.println("Şifrenizi değiştirmek ister misiniz?(E/H) : ");
			degis=scan.nextLine();
			if(sor.equals(degis)) {
				
				System.out.println("Yeni Şfirenizi Belirleyiniz : ");
				yeniSifre=scan.nextLine();
				sifre=yeniSifre;
				System.out.println("Yeni Şifreniniz Başarıyla Oluşturuldu.\nYeni Şifreniz : "+sifre);
			}else {
				System.out.println("Oturum Açılamadı!");
			}
		
		}
	}

}
