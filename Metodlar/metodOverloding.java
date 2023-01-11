package Metodlar;

public class metodOverloding {

    public static void mesajGoruntule(int sayi1,int sayi2, String mesaj){
        System.out.println("Mesajlar = "+sayi1+" "+sayi2+" "+mesaj);
    }
    public static void mesajGoruntule(int sayi, String mesaj){
        System.out.println("Mesajlar = "+sayi+" "+mesaj);
    }
    public static void main(String[] args) {
         mesajGoruntule(5, 3, "Java");
         mesajGoruntule(6, "Mesaj2");
    }
}
