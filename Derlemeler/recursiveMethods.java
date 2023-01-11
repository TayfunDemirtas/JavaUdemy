public class recursiveMethods {
    public static void main(String[] args) {
        int y= add(0);
        System.out.println(y);
        
    }

    static int add(int x){
        int toplam=0;
        for(int i=1;i<=10;i++){
            toplam+=i;
        }
        return toplam;
    }

    
}
