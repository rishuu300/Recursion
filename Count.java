public class Count {
    public static int count(int n){
        if(n%10==n)
            return 1;
        return 1 + count(n/10);
    }
    public static void main(String[] args) {
        int n = 9987;
        System.out.println(count(n));
    }
}
