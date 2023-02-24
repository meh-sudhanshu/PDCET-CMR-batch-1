import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.lang.*;
import java.util.*;
public class Main {

    // static class MyComparator implements Comparator<Integer>{
    //     @Override
    //     public int compare(Integer o1, Integer o2) {
    //         if(o1>o2) return -1;
    //         return 1;
    //     }
    // }
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(12);
        queue.add(18);
        queue.add(-80);
        queue.add(-48);
        printList(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static void printList(PriorityBlockingQueue<Integer> queue){
        for(int e:queue){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
