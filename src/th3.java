import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in) ;// khai báo đối tượng Scanner
        System.out.println("nhập width");//nhập chiều dài
        width = scanner.nextFloat();
        System.out.println("nhập height");//nhập chiều rộng
        height = scanner.nextFloat();
        float area = width * height ;
        System.out.println("area=" +area);

    }
}
