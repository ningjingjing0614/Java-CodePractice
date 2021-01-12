import java.util.Scanner;

public class BC24 {
    //    依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sco = sc.nextLine().split(" ");
        double sco1 = Double.parseDouble(sco[0]);
        double sco2 = Double.parseDouble(sco[1]);
        double sco3 = Double.parseDouble(sco[2]);
        double sum = sco1 + sco2 + sco3;
        double aver = sum / 3;
        System.out.printf("%.2f %.2f", sum, aver);
    }
}
