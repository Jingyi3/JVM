package basic;

/**
 * Created by ZJYYY on 2018/4/27.
 * 也可以用RUntime类 大致计算内存情况
 */
public class T03 {

    public static void main(String[] args) {
        printMemoryInfo();

        byte[] b = new byte[1024 * 1024];

        System.out.println("----------------");

        printMemoryInfo();
    }

    static void printMemoryInfo() {
        System.out.println("total: " + Runtime.getRuntime().totalMemory());
        System.out.println("free : " + Runtime.getRuntime().freeMemory());//还剩了多少内存

        //以上两个相减就是用了多少内存
    }
}
