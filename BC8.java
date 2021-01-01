public class BC8 {
    //    十六进制整数ABCDEF对应的十进制整数，所占域宽为15。
    public static void main(String[] args) {
        String num = "ABCDEF";
        int ret = Integer.parseInt(num,16);//结果转化为16进制为num
        System.out.printf("%15d", ret);
    }
}
