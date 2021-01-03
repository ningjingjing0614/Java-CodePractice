import java.util.Scanner;

public class BC12 {
    //    输入一个字符，用它构造一个三角形金字塔。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        char ch = str.charAt(0);//提取输入的字符串的第一个字符内容
        for (int i = 0; i < 5; i++) {
            int j = 0;
            for (j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - j; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
