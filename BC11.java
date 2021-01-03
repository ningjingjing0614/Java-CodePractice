//import java.util.Scanner;
//
//public class BC11 {
//// 输入描述:
////学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
////输出描述:
////学号，3科成绩，输出格式详见输出样例。
////  输入  17140216;80.845,90.55,100.00
////  输出  The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
//    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);
//        String stuNum = sc1.next();
//        Scanner sc2 = new Scanner(System.in);
//        double sco1 = sc2.nextDouble();
//        double sco2 = sc2.nextDouble();
//        double sco3 = sc2.nextDouble();
//        System.out.println("The each subject score of  No. " + stuNum + " is " + sco1 + ", " + sco2 +", " + sco3 + ".");
//    }
//}

import java.util.Scanner;

public class BC11 {
    // 输入描述:
//学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
//输出描述:
//学号，3科成绩，输出格式详见输出样例。
//  输入  17140216;80.845,90.55,100.00
//  输出  The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
//    import java.util.Scanner;
//    public class Main {
//        public static void main(String[] args) {
//            Scanner s = new Scanner(System.in);
//            String[] a = s.nextLine().split("[;,]");//split表示输入的字符以;,分割成String数组
//            int id = Integer.parseInt(a[0]);
//            double s1 = Double.parseDouble(a[1]);
//            double s2 = Double.parseDouble(a[2]);
//            double s3 = Double.parseDouble(a[3]);
//            System.out.print("The each subject score of  No. " + id + " is " + String.format("%.2f", s1) + ", " + String.format("%.2f", s2) + ", " + String.format("%.2f", s3) + ".");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("[;,]");
        String id = a[0];
        double s1 = Double.parseDouble(a[1]);
        double s2 = Double.parseDouble(a[2]);
        double s3 = Double.parseDouble(a[3]);
        System.out.print("The each subject score of  No. " + id + " is " + String.format("%.2f", s1) + ", " + String.format("%.2f", s2) + ", " + String.format("%.2f", s3) + ".");
    }
}
