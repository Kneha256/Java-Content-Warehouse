import java.util.*;
class Main {
    public static void main(String[] args) {
    HashMap<String, Integer> hm=new HashMap<String, Integer>();
    hm.put("a", 10);
    hm.put("b", 20);
    hm.put("c", 30);
    hm.put("d", 40);
    System.out.println(hm.containsValue(40)); //true
    System.out.println(hm.containsKey("c")); //true
    System.out.println(hm.size()); //4
    System.out.println(hm); //{a=10, b=20, c=30, d=40}
    hm.remove("b");
    hm.replace("c", 50);
    System.out.println(hm); //{a=10, c=50, d=40}
    System.out.println(hm.get("c")); //50
    System.out.println(hm.values()); //[10, 50, 40]
    System.out.println(hm.keySet()); //[a, c, d]
        
        
    }
}
