import java.util.Scanner;
public class quesix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Radius :");
        int radius = in.nextInt();
        float ansone = circu(radius);
        System.out.println("Circumfance " + ansone);
        float anstwo = area(radius);
        System.out.println("Area " + anstwo);

    }
    static float circu (int r){
        float pi = 22/7F;
        float ans = 2 * pi * r;
        return ans;
    }
    static float area (int a){
        float pi = 22/7F;
        float are = pi * a * a;
        return  are;
    }
}
