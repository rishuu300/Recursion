import java.util.ArrayList;

public class Josephus {
    public static int naive(int n, int k){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=n; i++){
            al.add(i);
        }
        
        int i=0;
        while(al.size() != 1){
            i = (i+k) % al.size();
            al.remove(i-1);
        }
        return al.get(0);
    }
    
    public static int josephus(int n, int k){
        if(n==1)
           return 0;
        return (josephus(n-1,k)+k)%n;
    }
    public static void main(String[] args){
        System.out.println(naive(3,2));
        System.out.println(josephus(3,2));
    }
}