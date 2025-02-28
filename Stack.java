// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a); //[10, 20, 30, 40, 50]
        System.out.println(a.pop()); //50
        System.out.println(a.peek()); //40
        System.out.println(a.contains(30)); //true
        System.out.println(a.isEmpty()); //false
        System.out.println(a.size()); //4
        System.out.println(a.get(2)); //40
        System.out.println(a.toArray()[3]); //40
        System.out.println(a); //[10, 20, 30, 40]
        a.set(3, 35);
        System.out.println(a); //[10, 20, 30, 35]
        
    }
}
