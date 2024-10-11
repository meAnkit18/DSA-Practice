import java.util.Scanner;

public class queone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number Below");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        max(a, b, c);
        min(a , b, c);
}
    static void max (int a, int b, int c){

        int maxi = a;
        if (b>=a){
            maxi = b;
        }
        if (c>=b){
            maxi = c;
        }
        System.out.println("Maximum number among them is " + maxi);

    }
    static void min (int a, int b, int c){

        int mini = a;
        if (b<=a){
            mini = b;
        }
        if (c<=b){
            mini = c;
        }
        System.out.println("Minimum number among  them is " + mini);

    }
}
