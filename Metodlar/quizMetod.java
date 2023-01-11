package Metodlar;

public class quizMetod {
    
    public static void hesapla(){
        
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+",");
            }
            
        }
    }
    public static void main(String[] args) {
        hesapla();
    }
}
