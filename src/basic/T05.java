package basic;

/**
 * Created by ZJYYY on 2018/4/27.
 *
 * 线程栈的大小
 *
 * 当这个线程栈内存调整的特别特别小的时候
 * 线程的并发数量就可以很多很多
 *
 * 如果调整的很大的话，线程的递归调用就可以很深很深
 *
 * 一个是胖一个是深
 *
 * -Xss128k
 *
 * Error: Could not create the Java Virtual Machine.
 Error: A fatal exception has occurred. Program will exit.

 The stack size specified is too small, Specify at least 160k
 */
public class T05 {

    static int count = 0;
    static void r() {
        count++;
        r();
    }

    public static void main(String[] args) {
        try {
            r();
        } catch (Throwable e) {
            System.out.println(count);
            e.printStackTrace();
            //OOM  out of memory 栈溢出
            //stackOverFlow
        }
    }
}
