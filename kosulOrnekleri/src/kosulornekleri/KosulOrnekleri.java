package kosulornekleri;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;
public class KosulOrnekleri {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
        //SORU-1
       /* System.out.println("Toplama--->1 "
                + "Çıkarma--->2 "
                + "Çarpma--->3 "
                + "Bölme--->4"); 
        
        System.out.println("SEÇİN:");
        int secim=klavye.nextInt();
        System.out.println("1.Sayi girin: ");
        int sayi1=klavye.nextInt();
        System.out.println("2.Sayi girin: ");
        int sayi2=klavye.nextInt();
        
        switch(secim)
        {
            case 1:System.out.println("Toplama: "+(sayi1+sayi2));break;
            case 2:System.out.println("Çıkarma: "+(sayi1-sayi2));break;
            case 3:System.out.println("Çarpma: "+(sayi1*sayi2));break;
            case 4:System.out.println("Bölme: "+(sayi1/sayi2));break;
            default:System.out.println("Hatalı seçim!");break;;
        }
        }
       
       //SORU-2
        System.out.println("santigrat(1)----fahrenhayt(2)-------SEÇİN: ");
        int secim=klavye.nextInt();
        switch(secim)
        {
            case 1:System.out.println("Fahrenhayt degeri girin: ");
            double fahrenhayt=klavye.nextDouble();
            double santigrat=(5/9*fahrenhayt)-32;
            System.out.println("Santigrat: "+santigrat);break;;
                
            case 2:System.out.println("Santigrat degeri girin: ");
            double santigrat=klavye.nextDouble();
            double fahrenhayt=(9/5*santigrat)+32;
                System.out.println("Fahrenhayt: "+fahrenhayt);
                
        }

       //SORU-3
        System.out.println("Vize notu: ");
        double vize=klavye.nextDouble();
        System.out.println("Final notu: ");
        double finalNotu=klavye.nextDouble();
        double ortalama=(vize*0.4+finalNotu*0.6);
        if(ortalama>=40)
        {
            System.out.println("Tebrikler geçtiniz.");
        }
        else
        {
            System.out.println("Maalesef kaldınız.");
        }*/
    }
    
}
