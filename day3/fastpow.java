public class fastpow {
    public static int fast(int base,int pow){
        if(pow==0) return 1;
        if(pow%2==0){
           int half=fast(base,pow/2);
            return half*half;
        }
        return base*(fast(base,pow-1));
    }
    public static void main(String[] args){
        System.out.print(fast(2,10));
    }
}
