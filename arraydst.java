import java.util.Arrays;

public class arraydst {
    public static int insert(int arr [] , int index , int value){
        if(arr.length == index){
            System.out.println("Array is Full");
            return index;
        }
        
        
    } 

    public static void main (String[] args) {
        int arr [] = new int [10] ;
        int index = 0;
        index = insert(arr,index,10);
        index = insert(arr, index, 5);
        System.out.println(Arrays.toString(arr));
    }
}

