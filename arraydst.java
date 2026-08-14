import java.util.Arrays;

public class arraydst {

    public static int insert(int arr[], int index, int value) {

        if (arr.length == index) {
            System.out.println("Array is Full");
            return index;
        }

        arr[index] = value;

        for (int i = 1; i <= index; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        return ++index;
    }


    public static void print (int arr [] , int index ){
       
        for(int i = 0 ; i < index ; i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }

    public static int search (int arr[] , int index,int target){
        if(index == 0){
            System.out.println("Array has no value to Search");
            return -1;
        }
        int start = 0 ;
        int end = index-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int delete(int arr[], int index, int target) {

            if (index == 0) {
                System.out.println("Array is empty");
                return index;
            }

            int start = 0;
            int end = index - 1;
            int position = -1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    position = mid;
                    break;
                }
                else if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }


            if (position == -1) {
                System.out.println("Value not found");
                return index;
            }


            for (int i = position; i < index - 1; i++) {
                arr[i] = arr[i + 1];
            }

            return index - 1;
        }

    public static void update (int arr[] , int index , int oldValue ,int NewValue){
        if (index == 0) {
            System.out.println("Array is empty");
            return;
        }

        index = delete(arr, index, oldValue);
        index = insert(arr, index, NewValue);
    }
    
    public static boolean isEmpty(int arr[],int index){
        if(index == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = new int[10];

        int index = 0;

        index = insert(arr, index, 10);
        index = insert(arr,index,50);
        index = insert(arr,index,20);
        index = insert(arr,index,30);
        index = insert(arr,index,40);
        index = insert(arr,index,100);
        index = insert(arr,index,90);
        index = insert(arr,index,80);
        index = insert(arr,index,70);
        index = insert(arr, index, 60);
        print(arr, index);
        System.out.println(search(arr, index, 100));
        index = delete(arr, index, 20);
        print(arr, index);
        update(arr, index, 30, 20);
        print(arr,index);
       System.out.println( isEmpty(arr, index));
    }
}