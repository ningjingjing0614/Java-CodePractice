import java.util.Scanner;
//体重公斤数除以身高米数平方得出的数字
public class BC25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        int wei = Integer.parseInt(st[0]);//体重 公斤
        int num = Integer.parseInt(st[1]);//身高 厘米
        double tal = num / 100.0;
        double ret = wei / Math.pow(tal, 2);
        System.out.printf("%.2f", ret);
        //System.out.println(tal);
    }
}
