
import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 number to check greatest among them:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a ;
        if (b>= a){
            max = b;
        }
        if (c>= b){
            max = c;

        }
        System.out.println(max);



    }
}
