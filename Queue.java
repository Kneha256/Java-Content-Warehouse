import java.util.*;
class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); //FIFO
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.add(40);
        System.out.println(q.poll());//10
        System.out.println(q);//[20, 30, 40]
        System.out.println(q.peek());//20
        System.out.println(q);//[20, 30, 40]
        System.out.println(q.size());//3
        System.out.println(q.isEmpty());//False
        System.out.println(q.contains(20)); //true
        System.out.println(q.toArray()[2]);//40
        System.out.println(q);
        
    }
}
