package Metodlar;

import java.util.Scanner;

public class quizMethod2 {

    public static void hesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz 'En fazla 100'e kadar sayı giriniz': ");
        int sayi1=input.nextInt();
        if(sayi1>100){
            System.out.print("Lütfen 100'e kadar sayı giriniz");
            return;
        }
        System.out.print("İkinci Sayıyı Giriniz '1 - 9 arasında rakam giriniz' : ");
        int sayi2 = input.nextInt();
        if(sayi2>100){
            System.out.print("Lütfen 1 - 9 'arasında rakam giriniz");
            return;
        }
        
        for(;sayi2<=sayi1;sayi2++){
            if(sayi1%sayi2==0){
                System.out.print(sayi2+",");       
            }
             
            
        }
        input.close();

    }
    public static void main(String[] args) {
        hesapla();
    }
}
