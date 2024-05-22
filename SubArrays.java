public class SubArrays {
    public static void subArrays(String str, String curr, int idx){
        if(idx==str.length()){
            System.out.println(curr);
            return;
        }
        subArrays(str,curr+str.charAt(idx),idx+1);
        subArrays(str,curr,idx+1);
    }
    public static void main(String[] args) {
        subArrays("ABC","",0);
    }
}
