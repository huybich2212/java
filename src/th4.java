import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        //Giải phương trình bậc nhất
        System.out.println("nhập các số");
        System.out.println("a * x + b =c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        double a = scanner.nextDouble ();
        System.out.println("b :");
        double b = scanner.nextDouble();
        System.out.println("c :");
        double c = scanner.nextDouble();
        if (a != 0)  {
            double answer = (c - b) /a ;
            System.out.println(answer);
        }else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
