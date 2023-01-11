public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi=28;
        int kalan=0;
        if(sayi<1){
            System.out.println("Geçersiz Sayı Girdiniz.");
            return;
        }
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                kalan+=i;
            }

        }
        
        if(sayi==kalan){
            System.out.println("Sayı Mükemmel Sayıdır.");
            System.out.println("Kalanların Toplamı : "+kalan);
        }
        else{
            System.out.println("Sayı Mükemmel Sayı Değildir.");
        }
    }
}
