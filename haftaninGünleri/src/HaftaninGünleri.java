import java.util.Scanner;
public class HaftaninGünleri {

    public static void main(String[] args) {
       Scanner klavye= new Scanner(System.in);
       
        System.out.println("Lütfen bir sayi girin: ");
        int sayi= klavye.nextInt();
        switch(sayi)
        {
           
            case 1:System.out.println("Pazartesi");break;
            case 2:System.out.println("Salı");break;
            case 3:System.out.println("Çarşamba");break;
            case 4:System.out.println("Perşembe");break;
            case 5:System.out.println("Cuma");break;
            case 6:System.out.println("Cumartesi");break;
            case 7:System.out.println("Pazar");break;
            default:System.out.println("Lütfen 1 ile 7 arası bir sayi girin: ");
        }
    }
    
}
