import java.util.Scanner;
import java.util.*;

public class switchtest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.next();

        switch (name) {
            case "Ankit" -> System.out.println("Owner off biggest tech company in the world");
            case "Aman" -> System.out.println("Ankit freind");
            case "Alak" -> System.out.println("Sister of Ankit");
            default -> System.out.println("Loading");
        }

    }
}
