//code for selection short

import java.lang.reflect.Array;
import java.util.Arrays;

public class slection {
    public static void main(String[] args) {
        int arr[]={1,6,4,-4,-33,0,3,8,7};
        System.out.println(Arrays.toString(arr));

        select( arr);

    }
 
    static void select(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            // find greatest number in the arr
                int g=0;
                for (int k = 0; k < n-i; k++) {
                    if(arr[g]<arr[k]){
                        g=k;
                    }
            }
             int temp= arr[g];
                arr[g]=arr[n-i-1];
                arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
