public class nCr {
    public static int fun(int n, int r){
        if(r==0 || n==r)
           return 1;
        return fun(n-1,r-1) + fun(n-1,r);
    }
    public static void main(String[] args) {
        System.out.println(fun(5,3));
    }
}
