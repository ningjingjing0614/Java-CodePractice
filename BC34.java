import java.util.Scanner;

public class BC34 {
    //输入一个十六进制数a，和一个八进制数b，输出a+b的十进制结果（范围-231~231-1）。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        String st1 = st[0].substring(2, st[0].length());
        String st2 = st[1].substring(1, st[1].length());
        int a = Integer.parseInt(st1,16);
        int b = Integer.parseInt(st2,8);
        System.out.println(a + b);
    }
}
