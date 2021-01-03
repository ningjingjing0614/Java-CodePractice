import java.util.Scanner;

public class BC10 {
//    输入描述:一行，3科成绩，用空格分隔，范围（0~100）。
//    输出描述:一行，把3科成绩显示出来，输出格式详见输出样例。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入范围为0~100的三个数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("score1=" + a + ",score2=" + b +",score3=" + c);

    }
}