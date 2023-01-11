
import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        // kullanıcı giriş ekranı
        //String kAdi = "Tayfun";
        //String kSifre="1234";
        Scanner input = new Scanner(System.in);
        
        for(int i=2;i<=3;i--){
        System.out.print("Kullanıcı Adı Giriniz :");
        String kAdi=input.nextLine();
        System.out.print("Kullanıcı Şifre Giriniz :");
        String kSifre=input.nextLine();
       
            if(kAdi.equals("Tayfun")&&kSifre.equals("1234")){
                System.out.println("Giriş Başarılı");
                break;
            }
                
            else{
                System.out.println("Giriş Başarısız."+i+" Hakkınız Kaldı...");
                if(i==0){
                    System.out.println("Giriş Hakkınızı Bitti Program Kapatıldı. !!!");
                    break;
                }
                continue; // bu komut işlemin tekrar döngüye girmesini sağlar.
                
            }
           
        }
        input.close();
    }
}
