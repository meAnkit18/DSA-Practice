import java.util.Scanner;
public class mininarray {
    public static void main(String[] args) {

        int[] arr ={57,867,4,42,66,88,321,23};
        System.out.println("Smallest Value in this array is : "+min(arr));

    }
    static int min(int[] arr){
        int minv=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            int no = arr[i];
            if(minv>arr[i]){
                minv = arr[i];
            }
        }
        return minv;
    }
}
