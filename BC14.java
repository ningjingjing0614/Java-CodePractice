import java.util.Scanner;

public class BC14 {
    //    输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
    //20130225
    //year=2013
    //month=02
    //date=25
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String year = str.substring(0, 4);
        String month = str.substring(4, 6);
        String date = str.substring(6, 8);
        System.out.println("year=" + year);
        System.out.println("month=" + month);
        System.out.println("date=" + date);
    }
}
