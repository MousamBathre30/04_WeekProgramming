package juint;

public class StringUtils {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String toUppercase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "naman";
        System.out.println(reverse(str));
        System.out.println(isPalindrome(str));
        System.out.println(toUppercase(str));
    }
}
