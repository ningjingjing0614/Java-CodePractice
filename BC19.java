import java.util.Scanner;

public class BC19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = 0;
        while (num > 0) {
            ret = num % 10;
            System.out.print(ret);
            num /= 10;
        }
    }
}
