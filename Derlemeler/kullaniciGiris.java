import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz : ");
        String kul_adi= kullanici.nextLine();
        System.out.print("Kullanıcı Şifre Giriniz : ");
        String kul_sifre = kullanici.nextLine();

        if(kul_adi.equals("admin") && kul_sifre.equals("admin")) // sorgulama string tipinden olduğu için 
                                                                                    // equals kullanılır. int == kullanılır.
        {
            System.out.println("Başarılı Giriş Yapıldı");
        }else{
            System.out.println("Kullanıcı Adı veya Şifre Hatalı");
        }
        kullanici.close();
    }
}
