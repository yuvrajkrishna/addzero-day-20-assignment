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
        System.out.print('[' + " " );
        for(int i = 0 ; i < index ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" " + "]");

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
    }
}