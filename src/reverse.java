import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int no = on.nextInt();

        int ans = 0;
        while (no > 0){
            int rem = no%10;
            no /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
