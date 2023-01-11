import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,sonuc;
        char islem;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı Giriniz : ");
        sayi1=input.nextInt();
        System.out.print("2. Sayı Giriniz : ");
        sayi2= input.nextInt();
        System.out.println("Lütfen İşlem Tipini; Toplama (+), Çıkartma (-), Çarpma (*), Bölme (/) seçiniz ");
        islem=input.next().charAt(0);
        if(islem=='+'){
            sonuc=sayi1+sayi2;
            System.out.println("Seçilen İşlem Toplama, Toplama Sonucu : "+sonuc);
        }
        else if(islem =='-'){
            sonuc=sayi1-sayi2;
            System.out.println("Seçilen İşlem Çıkartma, Çıkartma Sonucu : "+sonuc);
        }
        else if(islem == '*'){
            sonuc=sayi1*sayi2;
            System.out.println("Seçilen İşlem Çarpma, Çarpma Sonucu : "+sonuc);
        }else if(islem=='/'){
            sonuc=sayi1/sayi2;
            System.out.println("Seçilen İşlem Bölme, Bölme Sonucu : "+sonuc);
        }
        else{
            System.out.println("İşlem Seçilmedi");
        }
        input.close();
    }
}
