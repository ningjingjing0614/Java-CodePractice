import java.util.Scanner;

public class BC27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        double r = Double.parseDouble(st);
        double π = 3.1415926;
        double vol = (4 * (π * Math.pow(r, 3)))/3;
        System.out.printf("%.3f", vol);
    }
}
