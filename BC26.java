import java.util.Scanner;
//根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
public class BC26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        double a = Double.parseDouble(st[0]);
        double b = Double.parseDouble(st[1]);
        double c = Double.parseDouble(st[2]);
        double per = a + b + c;
        double p = per / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("circumference=%.2f area=%.2f", per, area);
    }
}
