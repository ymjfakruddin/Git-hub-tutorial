import java.util.*;
public class QU3 {
    public static void main(String[] args) {
        Queue<Integer> obj = new LinkedList<>();
        obj.add(10);
        obj.add(12);
        obj.add(33);
        System.out.println(obj.peek());
        obj.remove();
        System.out.println(obj.peek());
        Queue<Integer> obj1 = new ArrayDeque<>();
        obj1.add(111);
        obj1.add(112);
        obj1.add(32);
        System.out.println(obj1.peek());

    }
}
