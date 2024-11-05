import java.util.Scanner;
public class BinarySearchShort {
    public static void main(String[] args) {


//        int[] arr = {1,4,6,8,9,12,14,55,56};   //assending
        int[] arr = {99,88,77,66,5,4,3,2,2,1};    //desending
        int target = 2;
        System.out.println(orderAgnosticBS(arr,target));
    }

//    ...Only for the shorted arr.....
//    static int  searchbinary(int[] arr, int target){
//        int start =0;
//        int end = arr.length -1;
//        while (start <= end){
//            int mid = start + (end-start)/2;
//           if (target<arr[mid]){
//               end = mid-1;
//           } else if (target>arr[mid]) {
//               start= mid+1;
//        }else {
//               return mid;
//           }
//        }
//        return -1;
//    }

    //  order AgnosticBS
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
        boolean checkass = arr[start]<arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (checkass){
                if (target<arr[mid]){
                    end = mid-1;
                } else if (target>arr[mid]) {
                    start= mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end = mid-1;
                } else if (target<arr[mid]) {
                    start= mid+1;
                }
            }


        }

        return -1;
    }

}
