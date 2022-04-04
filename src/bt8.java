import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap số dola: ");
        int dola = Integer.parseInt(sc.nextLine());
        int vnd = dola * 23000;
        System.out.println(vnd);
    }
}