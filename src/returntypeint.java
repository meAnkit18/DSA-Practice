
import java.util.Scanner;
public class returntypeint {
    public static void main(String[] args) {
        age();

    }
    static void age(){
        Scanner in =new Scanner(System.in);
        int age1 = in.nextInt();
        int age2 = in.nextInt();
        int sum = age1 + age2;
        System.out.println(sum);
    }
}
