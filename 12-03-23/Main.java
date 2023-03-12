public class Main {
    public static void main(String[] args) {
        double[] arr = {1,-3,-2,4,-5,3,6,7,-4,9};
        Double max_sum = Double.NEGATIVE_INFINITY;
        Double current_sum = Double.NEGATIVE_INFINITY;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                current_sum  = arr[i];
            }else{
                if(arr[i] < 0){
                    if(current_sum > max_sum){
                        max_sum = current_sum;
                        current_sum+=arr[i];
                    }else{
                        current_sum+=arr[i];
                    }
                }else{
                    current_sum+=arr[i];
                }
            }
            if(current_sum <0) current_sum = 0.0;
            System.out.print(current_sum+" ");
        }

        System.out.println(Math.max(current_sum, max_sum));
    }    
}
