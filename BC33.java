import java.util.Scanner;

public class BC33 {
//    从键盘输入5个学生的成绩（整数），求他们的平均成绩（浮点数，保留一位小数）。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        int sco1 = Integer.parseInt(st[0]);
        int sco2 = Integer.parseInt(st[1]);
        int sco3 = Integer.parseInt(st[2]);
        int sco4 = Integer.parseInt(st[3]);
        int sco5 = Integer.parseInt(st[4]);
        double aver = (sco1 + sco2 + sco3 + sco4 + sco5) / 5.0;
        System.out.printf("%.1f",aver);
    }
}
