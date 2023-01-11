package Derlemeler;
public class arkadasSayi {
    public static void main(String[] args) {
        int sayi1=17296;
        int kalan1=0;
        int sayi2=18416;
        int kalan2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                kalan1+=i;
            }
        }
        for(int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                kalan2+=j;
            }
        }
        if(kalan1==sayi2 && kalan2==sayi1){
            System.out.println("Bu iki sayı arkadaş sayıdır");
        }
        else{
            System.out.println("Bu iki sayı arkadaş sayı değildir.");
        }

    }
}
