package basic;

import java.util.*;

/**
 * Created by ZJYYY on 2018/4/27.
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/Users/ZJYYY/JavaCode/JVM/tmp/jvm.dump -XX:+PrintGCDetails   -Xms10M -Xmx10M

 * -Xms10M 程序起始的时候为这个程序分配了多少内存  小于最大值 调优的时候会调到最大
 * -Xmx10M 最大 能有多少内存
 *
 * 内存文件的查看工具VisualVM
 * java bin目录下
 * 监测虚拟机运行情况
 */
public class T04 {
    public static void main(String[] args) {
        List<Object> lists = new ArrayList<>();

        for (int i =0;i<100000000;i++) {
            lists.add(new byte[1024 * 1024]);//内存溢出
        }
    }
}
