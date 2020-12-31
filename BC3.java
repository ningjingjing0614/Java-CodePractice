public class BC3 {
    //确定不同整型数据类型在内存中占多大（字节），输出不同整型数据类型在内存中占多大（字节）。
    public static void main(String[] args) {
//        System.out.println("Byte的字节数为：" + Byte.SIZE);//8个比特位
//        System.out.println("Byte的字节数为：" + Byte.BYTES);//1个字节
        System.out.println("Byte的字节数为：" + Byte.SIZE/Byte.SIZE);//占用的比特位/1个比特等于8位
        System.out.println("Short的字节数为：" + Short.BYTES);
        System.out.println("Int的字节数为：" + Integer.BYTES);
        System.out.println("Long的字节数为：" + Long.BYTES);
    }
}
