import java.util.*;
public class jcfQueues {
    
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
           }
           Queue<Integer> r = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
           }
        }

}
