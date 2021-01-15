import java.util.Scanner;

public class BC29 {
    //不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {//sc.hasNextLine()是错误的
            int n = sc.nextInt();
            long ret = (2 << (n - 1));
            System.out.println(ret);
        }
    }
}
