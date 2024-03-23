
public class Karzararhesap {

    
    public static void main(String[] args) {
        double leblebi=3.5;
        double findik=15.7;
        double badem= 22;
        
        double maaliyet =(leblebi*12+findik*25+badem*40);
        
        double kar_leblebi=((leblebi*0.5)+leblebi);
        double kar_findik=((findik*0.4)+findik);
        double kar_badem=((badem*0.6)+badem);
        
        double satisFiyat=(kar_leblebi*12+kar_findik*20+kar_badem*40);
        double karTutar=(satisFiyat-maaliyet);
        if(karTutar>=500)
        {
            System.out.println("Kirayı ödeyebilirsiniz!");
        }
        else
        {
            System.out.println("Kirayı ödeyemezsiniz.");
        }
        
    }
    
}
