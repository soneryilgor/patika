import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {

		int yas, rota, mesafe, gidisdonus;
		double kmUcret = 0.5, ucret, sonuc;

		System.out.println(
				"istanbul->ankara=1\nistanbul->antalya=2\nistanbul->adana=3\nistanbul->sivas=4\nistanbul->izmir=5\nistanbul->erzurum=6\nistanbul->van=7\nistanbul->trabzon=8");

		Scanner scan = new Scanner(System.in);
		System.out.print("Uçuş rotanızı seçiniz : ");
		rota = scan.nextInt();

		System.out.print("Yaşınızı Giriniz : ");
		yas = scan.nextInt();

		System.out.print("Biletiniz Gidiş-Dönüş mü Evet:1 Hayır:2? : ");
		gidisdonus = scan.nextInt();

		switch (rota) {
		case 1:
			mesafe = 351;
			if (yas < 12) {
				System.out.println("12");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 2:
			mesafe = 481;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 3:
			mesafe = 708;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 4:
			mesafe = 695;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 5:
			mesafe = 320;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 6:
			mesafe = 1040;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 7:
			mesafe = 1261;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			break;
		case 8:
			mesafe = 895;
			if (yas < 12) {
				System.out.println("yas 12den kücük");
				ucret = mesafe * kmUcret * 0.50;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas >= 12 && yas <= 24) {
				System.out.println("yas 12den büyük 25ten kücük");
				ucret = mesafe * kmUcret * 0.90;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else if (yas > 65) {
				System.out.println("yas 65ten büyük");
				ucret = mesafe * kmUcret * 0.70;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			} else {
				System.out.println("yas 25ten büyük 65ten kücük");
				ucret = mesafe * kmUcret;
				if (gidisdonus == 1) {
					sonuc = ucret * 0.80;
					System.out.println("Yolculuk Ücretiniz : " + sonuc);
				} else {
					System.out.println("Yolculuk Ücretiniz : " + ucret);
				}
			}
			scan.close();
			break;
		}
	}
}
