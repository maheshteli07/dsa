import java.util.HashMap;

public class freqofnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6,7,8, 1, 2, 3, 4, 5};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> pair : freq.entrySet()){
            System.out.println("Frequency of " + pair.getKey() + " is: " + pair.getValue());
        }
    }
}
