
import java.util.Scanner;

public class ucakBiletHesaplama {
    public static void main(String[] args) {
        int yas,tip;
        double km;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Km Giriniz : ");
            km=input.nextInt();
            
            System.out.print("Lütfen Yolcu Yaşını Giriniz : ");
            yas=input.nextInt();

            // System.out.print("Bilet Durumu : 1- Gidiş, 2- Gidiş Dönüş : ");
            // tip=input.nextInt();
            km=km * 1.10;

            for(int i=2;i<=3;i--){
            System.out.print("Bilet Durumu : 1- Gidiş, 2- Gidiş Dönüş : ");
            tip=input.nextInt();
            if(tip ==1 || tip == 2){
                System.out.println("Bilgiler Doğru");
                break;
                
            }else{
                System.out.println("Lütfen Belirtilen Tiplerden Giriniz...!!!");
                System.out.println(i+ " kere Hakkınız Kaldı.");
                if(i==0){
                    System.out.println("Giriş Yapamadınız. Program Kapatıldı. !!!");
                    return;
                }
            }
      
      }
            // Yaş ücretlemesi
            if(yas<12){
                km=km-((km * 50)/100);
                System.out.println("12 Yaş Altı Çocuk İndirimi : "+km);
            }
            else if(yas>=12 && yas<=24){
                km=km-((km*10)/100);
                System.out.println("12 & 24 Yaş Arası İndirim : "+km);
                
            }
            else if(yas>=65){
                km=km-((km*30)/100);
                System.out.println("65 Yaş Üstü İndirimi :  "+km);
            }
            else{
                System.out.println(km);
            }
            input.close();
        }  
    }
    
}
