public class returnMethod {
    public static void main(String[] args) {
        int c= ustAlma(3, 2);
        System.out.println(c);
    }

    static int ustAlma(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
}
