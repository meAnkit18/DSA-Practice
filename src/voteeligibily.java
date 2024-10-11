import java.util.Scanner;
import java.util.Scanner.*;
public class voteeligibily {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        check(age);
    }
    static int check( int op){
        if (op >= 18){
            System.out.println("He/She eligible to vote");
        }
        else {
            System.out.println("He/She not eligible to vote");
        }
        return op;
    }
}
