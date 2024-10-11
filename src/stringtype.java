import java.util.Scanner;

import static java.lang.System.*;

public class stringtype {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = in.next();
    greeting(name);

    }
    static String greeting (String naam){
        out.println("hello " + naam);
        return naam;
    }
}