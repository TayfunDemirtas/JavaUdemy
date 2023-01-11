public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,0};
        int aranacak = 10;
        int sonuc=0;

        if(aranacak>9 || aranacak<0){
            System.out.println("Lütfen 0 ile 9 arasında sayı giriniz.!!!");
            return;
        }
        for(int i=0;i<sayilar.length;i++){
            if(aranacak==i)
            {
                sonuc=i;
                break;
            }
            
        }
        if(sonuc==aranacak){
            System.out.println("Sayıyı doğru tahmin ettiniz.");
        }
        else{
            System.out.println("Doğru Tahmin Edemediniz.");
        }
        
        
    }    
}
