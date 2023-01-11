
package Metodlar;

public class alanHesapla {
    public static void main(String[] args) {
        int gelsin = hesapla(12, 15);
        System.out.println(gelsin);
    }

    public static int hesapla(int kenar1, int kenar2){
        int alan = kenar1*kenar2;
        return alan;
    }
}
