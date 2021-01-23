import java.util.Scanner;

public class BC35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            int num = st.charAt(0);
            //System.out.println(num);
            if (num >= 65 && num <= 90 || num >= 97 && num <= 122) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
//        int a = 'a';//可以
//        System.out.println(a);
    }
}
