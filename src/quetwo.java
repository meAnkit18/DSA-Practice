import java.util.Scanner;
public class quetwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        check(inp);
    }
    static void check (int inp){
        int rem = inp % 2;
        if (rem == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
