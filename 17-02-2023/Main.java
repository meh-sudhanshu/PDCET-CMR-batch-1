import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // int[] arr = new int[3];
        // arr[0]=11;
        // arr[1]=22;
        // arr[2]=34;
        
        // boolean[] arr = new boolean[3];

        // arr[0] = true;
        // arr[1] = false;
        // arr[2] = true;

       

        //int[] arr ={2,3,4,5,6,7,8,9};

        //  for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // } 
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(85);
        arr.add(65);
        arr.add(69);
        arr.add(2,20);




        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println(arr.size());

        arr.remove(1);

        for(int e:arr){
            System.out.print(e+" ");
        }

    }
}
