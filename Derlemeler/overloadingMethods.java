public class overloadingMethods {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2,3,2.2)); 
    }

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add (int a, int b, double c){
        return a+b+c;
    }
}
