public class Subsets_sum {
    public static int subsetsSum(int arr[], int n, int sum){
        if(n == 0)
           return (sum==0)?1:0;
        return subsetsSum(arr, n-1, sum-arr[n-1]) + subsetsSum(arr,n-1,sum);
    }
    public static void main(String[] args){
        int arr[] = {45,90,76,98,36};
        System.out.println(subsetsSum(arr,arr.length,76));
    }
}
