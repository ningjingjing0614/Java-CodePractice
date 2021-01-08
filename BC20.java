import java.util.Scanner;

public class BC20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        String f1 = st[0];
        int a = Integer.parseInt(f1);
        int b = Integer.parseInt(st[1]);
//        System.out.println(a);
//        System.out.println(b);
        int sum = a + b;
        System.out.println(sum % 100);
    }
}
