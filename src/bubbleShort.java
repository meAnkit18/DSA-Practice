import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[]={1,6,4,-4,-33,0,3,8,7};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        

    }
    static void bubble(int arr[]){
        int n=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
