public class Factorial {
    public static int fact(int n){//Non-Tail
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void fact(int n, int k){//Tail
        if(n==0){
            System.out.println(k);
            return;
        }
        fact(n-1,k*n);
    }
    public static void main(String[] args) {
       fact(4,1);
       System.out.println(fact(4));
    }
}
