import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int a,b,toplam;

        System.out.print("A sayısını giriniz :");
        a= tara.nextInt();
        System.out.print("B sayısını giriniz :15");
        b= tara.nextInt();
        toplam=a+b;
        System.out.print("İki Sayının Toplamı :"+toplam);
        tara.close();
        

    }
}
