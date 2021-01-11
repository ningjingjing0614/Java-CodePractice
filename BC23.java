import java.util.Scanner;

public class BC23 {
    //给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        //按秒，分，时输出
//        while (time > 0) {
//            int n = time % 60;
//            System.out.print(n + " ");
//            time /= 60;
//        }
        //按时，分，秒输出
        int a = time / 3600;
        int b = (time % 3600) / 60;
        int c =time % 60;
        System.out.println(a + " " + b + " " + c);
    }
}
