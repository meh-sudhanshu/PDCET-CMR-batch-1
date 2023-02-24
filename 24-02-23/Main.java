public class Main {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node start = new Node(0);
        int[] arr = {1,2,3,4,5};
        start = addElemnts(arr, start);
        printList(start);
        start = deleteFromStart(start);
        printList(start);
        start = deletFromEnd(start);
        printList(start);
    }

    public static Node deletFromEnd(Node start){
        if(start == null){
            System.out.println("empty list");
            return null;
        }
        if(start.next == null){
            return null;
        }
        Node temp = start;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return start;
    }


    public static Node deleteFromStart(Node start){
        if(start == null){
            System.out.println("nothing to delete");
            return null;
        }
        start = start.next;
        return start;

    }

    public static void printList(Node start){
        if(start == null){
            System.out.println("List is empty");
        }else{
            while(start !=null){
                System.out.print(start.value+" ");
                start= start.next;
            }
            System.out.println();
        }
    }
    public static Node addElemnts(int[] arr,Node start){
        Node temp = start;
        for(int e : arr){
            Node temp_node = new Node(e);
            temp.next = temp_node;
            temp = temp.next;
        }
        return start;
    }
}
