public class Numbers{
    public static void oneToN(int n){//Non-Tail
        if(n==0){
            return;
        }
        oneToN(n-1);
        System.out.print(n+" ");
    }
    public static void oneToN(int n, int k){//Tail
        if(n==0){
            return;
        }
        System.out.print(k+" ");
        oneToN(n-1,k+1);
    }
    public static void nToOne(int n){//Tail
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        nToOne(n-1);
    }
    public static void main(String[] args){
        oneToN(5);
        oneToN(5,1);
        nToOne(5);
    }
}