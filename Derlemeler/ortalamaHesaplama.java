import java.util.Scanner;

public class ortalamaHesaplama {

    public static void main(String[] args) {
        double yazili1,yazili2,yazili3,ortalama;

        Scanner veriAl = new Scanner(System.in);
        System.out.print("1. Yazılıyı Giriniz :");
        yazili1=veriAl.nextDouble();
        System.out.print("2. Yazılıyı Giriniz :");
        yazili2=veriAl.nextDouble();
        System.out.print("3. Yazılıyı Giriniz :");
        yazili3=veriAl.nextDouble();
        ortalama=(yazili1+yazili2+yazili3)/3;
        System.out.println("Öğrencinin Ortalaması :"+ortalama);
        
        if(ortalama <=100 && ortalama>=90){
            System.out.println("Notunuz AA");
        }
        else if(ortalama <=89 && ortalama>=85){
            System.out.println("Notunuz BA");
        }
        else if(ortalama<=84 && ortalama>=80){
            System.out.println("Notunuz BB");
        }
        else if(ortalama<=79 && ortalama>=75){
            System.out.println("Notunuz CB");
        }
        else if(ortalama<=74 && ortalama>=70){
            System.out.println("Notunuz CC");
        }
        else if (ortalama<=69 && ortalama>=65){
            System.out.println("Notunuz DC");
        }
        else if (ortalama<=64 && ortalama>=60){
            System.out.println("Notunuz DD");
        }
        else if(ortalama<=59 && ortalama>=50){
            System.out.println("Notunuz DE");
        }
        else if (ortalama<=49 && ortalama>=45){
            System.out.println("Notunuz EE");
        }
        else{
            System.out.println("Notunuz FF Kaldınız !!!");
        }
        veriAl.close();
    }
}
