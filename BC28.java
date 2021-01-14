import java.util.Scanner;

public class BC28 {
//    实现字母的大小写转换。多组输入输出。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String st = sc.nextLine();
            char ch = st.charAt(0);
            int nch = ch;
            System.out.printf("%c\n",nch + 32);
        }
    }
}
