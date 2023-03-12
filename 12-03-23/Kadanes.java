

public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {1,2,-2,4,-1,5,3,4,-7,4};
        int size = 3;

        int i=0,j=size-1;
        Integer max_sum = Integer.MIN_VALUE;
        Integer curr_sum = 0;
        while(j<arr.length){
            if(i==0){
                for(int k=i;k<=j;k++){
                    curr_sum+=arr[k];
                }
                i+=1;j+=1;
            }else{
                curr_sum = curr_sum - arr[i-1]+arr[j];
                i+=1;
                j+=1;
            }

            if(curr_sum > max_sum) max_sum = curr_sum;
        }
        System.out.println(Math.max(curr_sum,max_sum));
    }
}
