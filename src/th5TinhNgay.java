import java.util.Scanner;

public class th5TinhNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhập tháng muốn đếm ngày");
        int month = scanner.nextInt();
        switch (month) {
            case 2 :
                System.out.println("tháng '2' có 28 hoặc 29 ngày");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("the month '" + month + "'has 31 days" );
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }

    }
}
