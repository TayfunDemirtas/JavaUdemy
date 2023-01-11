import java.util.Scanner;
public class metod2 {
    public static void main(String[] args) {
        int ortalama = hesapla();

        if (ortalama>80){
            geçti(ortalama);
        }
        else if(ortalama<79 && ortalama>55){
            orta(ortalama);
        }
        else if(ortalama<54){
            uyari1(ortalama);
        }
        
       
    }
    static void geçti(int sonuc){
        System.out.println("Başarılı Geçtiniz.. Sonuç :"+sonuc);
    }
    static void orta(int sonuc){
        System.out.println("Orta bir not aldınız. Sonuç :"+sonuc);
    }
    static void uyari1(int sonuc){
        System.out.println("Kaldınız. Sonuç :"+sonuc);
    }
    static int hesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. notu giriniz :");
        int not1=input.nextInt();
        System.out.print("2. not giriniz :");
        int not2=input.nextInt();
        System.out.print("3. notu giriniz :");
        int not3=input.nextInt();
        int sonuc =0;
        sonuc = (not1+not2+not3)/3;
        input.close();
        return sonuc;   
    }
    
}
