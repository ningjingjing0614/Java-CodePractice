
import java.util.Scanner;

public class BC15 {
    //输入两个整数，范围-231~231-1，交换两个数并输出。
//    输入 a=1,b=2
//    输出 a=2,b=1
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] str = sc.nextLine().split(",");
////        int a = sc.nextInt();
////        int b = sc.nextInt();
//        String[] s1 = str[0].split("=");
//        String ret1 = s1[1];
//        int a = Integer.parseInt(ret1);
//        String[] s2 = str[1].split("=");
//        String ret2 = s2[1];
//        int b = Integer.parseInt(ret2);
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a=" + a + ",b=" + b);

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        String[] s1 = str[0].split("=");
        String fro = s1[1];
        int a = Integer.parseInt(fro);
        String[] s2 = str[1].split("=");
        //String lat = s2[1];
        int b = Integer.parseInt(s2[1]);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a=" + a + ",b=" + b);
    }
//    String[] st = sc.next().split("0");
//        System.out.println(st[1]);
//    String a = "123456";
//    String[] b = a.split("4");
//        System.out.println(b[1]);
}
