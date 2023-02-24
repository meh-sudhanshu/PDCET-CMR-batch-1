import java.lang.Integer;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Main {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // printList(stack);
        // stack.pop();
        // printList(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack.size());

        // ArrayList<Integer> queue = new ArrayList<>();
        // push(10,queue);
        // push(30,queue);
        // push(40,queue);
        // push(50,queue);
        // printList(queue);
        // pop(queue); 
        // pop(queue);
        // printList(queue);
        // peek(queue);
        // printList(queue);
        // System.out.println(queue.size());
        
        // Queue<Integer> queue = new PriorityBlockingQueue<>();
        // Queue<Integer> queue = new PriorityQueue<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.poll();// it will pop the top element of the queue
        System.out.println(queue.peek());
        printList(queue);
    }

    // public static void peek(ArrayList<Integer> queue){
    //     if(queue.size() == 0){
    //         System.out.println("queue is empty");
    //     }else{
    //         System.out.println(queue.get(0));
    //     }
    // }

    // public static void pop(ArrayList<Integer> queue){
    //     if(queue.size() == 0){
    //         System.out.println("queue is empty");
    //     }else{
    //         System.out.println(queue.remove(0)+" is removed");
    //     }
    // }

    // public static void push(int val , ArrayList<Integer> queue){
    //     queue.add(val);
    // }

    public static void printList(Queue<Integer> queue){
        for(int e : queue){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
