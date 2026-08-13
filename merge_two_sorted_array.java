import java.util.Arrays;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,7,9};
        int arr2[] = {0,2,6,8,10};
        int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int [n+m];
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<n){
            arr3[k++] = arr1[i++];
        }
        
        while(j<m){
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
