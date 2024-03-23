
package ısıdönüşümleri;
import java.util.Scanner;
public class IsıDönüşümleri {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Dönüşümü seçin!");
        System.out.println("Fahrenhayt ---> Celcius(1)"
                + "Celcius ---> Fahrenhayt(2)");
        int secim=klavye.nextInt();
        if(secim==1)
        {
            System.out.println("Fahrenhayt degerini girin: ");
            double fahrenhayt=klavye.nextDouble();
            double celcius=((fahrenhayt-32)/1.8);
            System.out.println("Celcius degeri: "+celcius);
        }
        else
        {
            System.out.println("Celcius degerini girin: ");
            double celcius=klavye.nextDouble();
            double fahrenhayt=((celcius*1.8)+32);
            System.out.println("Fahrenhayt degeri: "+fahrenhayt);
        }
       
    }
    
}
