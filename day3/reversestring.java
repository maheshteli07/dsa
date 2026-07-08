public class reversestring {
    public static String reverse(String s,int i){
        if(i<0) return "";
        return s.charAt(i)+reverse(s,i-1);
    }
    public static void main(String[] args){
        String s="abcde";
        System.out.print(reverse(s,s.length()-1));
    }
}
