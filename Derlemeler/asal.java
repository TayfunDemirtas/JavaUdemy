public class asal {
    public static void main(String[] args) {
        int sayi=11;
        int sayac=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println(sayi+" Sayı Asaldır.");
        }
        else{
            System.out.println(sayi+" Sayı Asal Değildir.");
        }
    }
}
