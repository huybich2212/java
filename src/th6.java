import java.util.Scanner;

public class th6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm  cần check");
        int year ;
        year = scanner.nextInt();
        boolean LeapYear = false;

        boolean isDivisibleBy4 = year % 4 ==0;
        if (isDivisibleBy4)  {
            boolean isDivisibleBy100 = year % 100 ==0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 ==0;
                if (isDivisibleBy400) {
                    LeapYear = true;
                }
            }else {
                LeapYear = true;
            }

        }
        if (LeapYear) {
            System.out.println("là năm nhuận ");
        }else{
            System.out.println("ko phải năm nhuận ");
        }







    }
}
