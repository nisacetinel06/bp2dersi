
package javasınavsoruları;
import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;
public class Javasınavsoruları {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        /*ring sifre="1126";
        System.out.println("Bir sifre girin: ");
        String kullaniciSifre=klavye.nextLine();
        if(kullaniciSifre.equals(sifre))
        {
            System.out.println("Şifre doğru!");
            
        }
        else
        {
            System.out.println("Şifre yanlış!");
        }
        int sayi1,sayi2;
        int islemler;
        System.out.println("TOPLAMA --->1"
                + "ÇIKARMA --->2"
                + "ÇARPMA --->3"
                + "BÖLME --->4");
        System.out.println("1. Sayı: ");
        sayi1 =klavye.nextInt();
        System.out.println("2.Sayı: ");
        sayi2=klavye.nextInt();
        System.out.println("İşlem seçin: ");
        islemler=klavye.nextInt();
        switch(islemler)
        {
            case 1:System.out.println("Toplama sonucu: "+(sayi1+sayi2));break;
            case 2:System.out.println("Çıkarma sonucu: "+(sayi1-sayi2));break;
            case 3:System.out.println("Çarpma sonucu: "+(sayi1*sayi2));break;
            case 4:System.out.println("Bölme sonucu: "+(sayi1/sayi2));break;
            default:System.out.println("Hatalı seçim tekrar deneyin.");break;
        }*/
        double toplam=0;
        for (int i = 0; i < 100;i++) 
        {
            toplam+=i;
            System.out.println("İşlem sonucu: "+toplam);
        }
            
        }
        
    }
    
}
