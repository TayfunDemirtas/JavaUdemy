public class parametreliMetods {
    static String adi, soyadi;
    public static void main(String[] args) {
        //int x = sayi(3,4,5,6);
        //System.out.println(x);
        // bilgiAl("Tayfun", "Demirtaş");
        // yaz();
        System.out.println(topla(10));
    }
    //  public static int sayi(int...sayilar){ // Burası dizi oluşturur
    //     int toplam =0;
    //      for(int hesap:sayilar){
    //          toplam+=hesap;
    //      }
    //      return toplam;

    // }
        //-----------------------------------------------------

        // METODLAR DA ÖZYİNELEME (RECURSION)
    static int topla(int sayi){
        if(sayi==0){
            return 0;
        }
        else{
            return(sayi+(topla(sayi-1)));
        }
        
    }


    // static void bilgiAl(String ad, String Soyad){
    //     adi = ad;
    //     soyadi = Soyad;
    //  }
    // public static void yaz(){
    //      System.out.println("Adınız :"+adi+" "+soyadi);
        
    //  }
}
