
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char alp = in.next().trim().charAt(0);
        if (alp<= 'a' && alp >='Z'){
            System.out.print("LowerCase");
        }
        else {
            System.out.println("UpperCase");
        }

    }
}