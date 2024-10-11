import java.util.Scanner;
public class queseven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        boolean ans = isPrime(no);
        System.out.println(ans);

    }
    static boolean isPrime (int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i<n; i++){
            if (n % i == 0){
                return false;
            }

        }
        return true;
    }
}
