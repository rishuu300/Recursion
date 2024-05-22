public class Palindrome {
    public static boolean palindrome(String str, int s, int e){
        if(s==e)
           return true;
        if(str.charAt(s)!=str.charAt(e))
           return false;
        return palindrome(str,s+1,e-1);
    }
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
