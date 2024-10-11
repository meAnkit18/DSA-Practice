import java.util.Scanner;
public class quefour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int op = summ( a, b);
        System.out.println("Product is " + op);
    }
    static int summ (int a, int b){
        int ans = a * b;
        return ans;
    }
}
