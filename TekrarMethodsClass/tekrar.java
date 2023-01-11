package TekrarMethodsClass;

import java.util.Scanner;

public class tekrar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i=2;i<=3;i--){
        System.out.print("Lütfen Kullanıcı Adını Giriniz :");
        String kAdi= input.next();
            if(kAdi.equals("Tayfun") || kAdi.equals("tayfun")){
                System.out.println("Kullanıcı Adı Doğru");
                
            }
            else{
                System.out.println("Kullanıcı Adı Yanlış "+i+" kere hakkınız kaldı");
                if(i==0){
                    System.out.println("Giriş Hakkınız Bitti.!!!");
                    
                    break;
                }
            }
            for(int j=2;j<=3;j--){
            System.out.print("Kullanıcı Şifresini Giriniz :");
            int kSifre = input.nextInt();
            if(kSifre == 1234){
                System.out.println("Kullanıcı Şifre Doğru");
                break;
            }
            else{
                System.out.println("Kullanıcı Şifre Yanlış "+j+" kere hakkınız kaldı.");  
                if(j==0) break;     
            }
                  
            } 
            
            break;
        }

        input.close();
        araba1 arac = new araba1();
        arac.setName("mercedes");
        arac.setRenk("Mavi");
        arac.setVites("Düz");
        arac.setil("Balıkesir");
        arac.setKm(1200);
        arac.setFiyat(5000);
        // System.out.println(arac.getName());
        // System.out.println(arac.getFiyat());
        
        String dizi[]= {"Araç Marka :"+arac.getName(),"Araç Renk :"+arac.getRenk(),"Araç Vites Türü :"+arac.getVites(),
        "Araç İl :"+arac.getil(),"Araç Km :"+arac.getKm()+"","Araç Fiyat :"+arac.getFiyat()+""};
        for(String al:dizi){
            System.out.println(al);
        }

    }
}