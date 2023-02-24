import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        push(20,stack);
        push(40,stack);
        push(60,stack);
        push(-1,stack);
        System.out.println(peek(stack));
        printList(stack);
    }

    public static String peek(ArrayList<Integer> stack){
        if(stack.size() == 0){
            return "stack is already empty";
        }
        return stack.get(stack.size()-1).toString();
    }

    public static String pop(ArrayList<Integer> stack){
        if(stack.size() == 0){
            return "stack is empty";
        }
        return stack.remove(stack.size()-1).toString();
    }
    

    public static void printList(ArrayList<Integer> stack){
        for(int e : stack){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    
    public static void push(int val , ArrayList<Integer> stack){
        stack.add(val);
    }
}
