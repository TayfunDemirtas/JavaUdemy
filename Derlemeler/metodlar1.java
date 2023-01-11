import javax.swing.text.html.StyleSheet;

public class metodlar1 {
    public static void main(String[] args) {
        //f(4);
        ustAlma(3, 2);
    } 

    static void f(int x){
        int result = (x+2)*6;
        System.out.println(result);
    }
    static void ustAlma(int y,int z){
        int sonuc=1;
        for(int i=1;i<=z;i++){
            sonuc*=y;
        }
        System.out.println(sonuc);
    }
}
