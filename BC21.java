import java.util.Scanner;
//给定一个浮点数，要求得到该浮点数的个位数。
public class BC21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(s[0].charAt(s[0].length()-1));
        String[] st = sc.nextLine().split("\\.");
        int num = Integer.parseInt(st[0]);
        int ret = num % 10;
        System.out.println(ret);
    }
}
