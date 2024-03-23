
package karetoplamlar;
import java.util.Scanner;
public class KareToplamlar {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayi girin: ");
        int sayi=klavye.nextInt();
        System.out.println(sayi+" sayisinin kare toplamı açılımı: ");
        for (int i = 0; i <sayi/2; i++)
        {
            for (int j = 0; j <sayi/2; j++) 
            {
                if(i*i+j*j==sayi)
                {
                    System.out.println(i+"*"+i+"+"+j+"*"+j);
                }
            }
        }
    }
    
}
