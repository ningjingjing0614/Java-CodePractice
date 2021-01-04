public class BC13 {
    //    BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。
// BoBo出了一个问题给KiKi，转换以下ASCII码为对应字符并输出他们。
//            73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116 , 33
    public static void main(String[] args) {
        int[] num = {73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116, 33};
        for (int i = 0; i < 12; i++) {
            System.out.printf("%c", num[i]);
        }
    }
}
