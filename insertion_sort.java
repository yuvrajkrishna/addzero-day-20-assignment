import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1};

        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i] ;
            int prev = i - 1 ;
            // finding out correct position to insert
            while(prev >= 0  && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--; 
            }
            // insertion
            arr[prev+1] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }
}