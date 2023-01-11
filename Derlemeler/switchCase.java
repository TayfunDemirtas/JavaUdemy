
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        switch (sayi) {
            case 1:System.out.println("Sayi 1 dir");
                
                break;
            case 2 :System.out.println("Sayi 2 dir");
                break;
            case 3 : System.out.println("Sayi 3'e eşittir");
                break;
            default:System.out.println("Girilen Sayı Eşit Değil");
                break;
            
        }
        input.close();
    }
}
