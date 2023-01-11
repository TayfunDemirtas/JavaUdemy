//import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

//import javax.swing.text.StyledEditorKit;

public class metodlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mesaj1();
        String kAdi = input.nextLine();
        mesaj2();
        String kSifre = input.nextLine();
        input.close();
    }
    
    public static void mesaj1(){
        System.out.println("Kullanıcı Adınız Giriniz :");
    }
    public static void mesaj2(){
        System.out.println("Kullanıcı Şifre Giriniz :");
    }

}
