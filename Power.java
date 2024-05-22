public class Power {
    static int mod = 1000000007;
    public static long power(int n,int x){
        if(x==0){
            return 1;
        }

        if(n==0){
            return 0;
        }

        if(x%2==0){
            long temp = power(n,x/2);
            return ((temp%mod) * (temp%mod)) % mod;
        }
        else{
            long temp = n * power(n,x-1);
            return (temp%mod);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
}
