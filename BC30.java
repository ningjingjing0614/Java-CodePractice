import java.util.Scanner;

public class BC30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] st = sc.nextLine().split(" ");
            int n = Integer.parseInt(st[0]);//总瓶数n
            int h = Integer.parseInt(st[1]);//h分钟喝完一瓶
            int m = Integer.parseInt(st[2]);//经过m分钟
            int ret = 0;//计算之后还剩ret瓶
            if (m % h == 0) {
                ret = n - (m / h);
            } else {
                ret = n - (m / h) - 1;
            }
            System.out.println(ret);
        }
    }
}
