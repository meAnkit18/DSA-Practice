import java.util.Scanner;

import static java.lang.System.out;

public class gradedisplayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        grade(no);

    }
    static void grade(int n){
        if (n >90 && n<=100){
            out.println("AA");
        } else if (n >80 && n<=90) {
            out.println("AB");
        }
        else if (n >70 && n<=80) {
            out.println("BB");
        }
        else if (n >60 && n<=70) {
            out.println("BC");
        }
        else if (n >50 && n<=60) {
            out.println("CD");
        }
        else if (n >40 && n<=50) {
            out.println("DD");
        }
        else out.println("Fail");
    }
}
