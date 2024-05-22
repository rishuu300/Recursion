public class Hanoi {
    long solve(int N, int src, int aux, int dest){
        if(N==1){
            System.out.println("move disk "+ N +" from rod "+ src +" to rod " + dest);
            return 1;
        }
        long one = solve(N-1,src,dest,aux);
        System.out.println("move disk "+ N +" from rod "+ src +" to rod " + dest);
        long three = solve(N-1,aux,src,dest);
        
        return 1 + one + three;
    }

    public long toh(int N, int from, int to, int aux) {
        return solve(N,1,2,3);
    }

    public static void main(String[] args) {
        
    }
}
