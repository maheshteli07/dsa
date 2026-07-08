class fibo{
    public static int fibon(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibon(n-1)+fibon(n-2);
    }
    public static void main(String[] args){
           System.out.print(fibon(6));
    }
}