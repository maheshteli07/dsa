class checkpal{
    public static boolean check(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return check(s,l+1,r-1);

    }
    public static void main(String[] args){
        String s="abababbababa";
        System.out.print(check(s,0,s.length()-1));
    }
}