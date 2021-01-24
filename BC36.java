import java.util.Scanner;

public class BC36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        double wei = Double.parseDouble(st[0]);//体重 公斤
        double tal = Double.parseDouble(st[1]);//身高 米
        double ret = wei / Math.pow(tal, 2);
        if (ret >= 18.5 && ret <= 23.9) {
            System.out.println("Normal");
        } else {
            System.out.printf("Abnormal");
        }
    }
}
