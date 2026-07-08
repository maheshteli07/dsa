import java.util.HashMap;

public class countfreq {
    public static void main(String[] args) {
      String s=" abcdeae";
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);  
    }
    for(int i=0;i<map.size();i++){
        System.out.println(s.charAt(i)+" " +map.get(s.charAt(i)));
    }
           
}
}