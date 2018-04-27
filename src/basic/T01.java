package basic;

/**
 * Created by ZJYYY on 2018/4/27.
 * <p>
 * 更改run的configuration
 * jvm argument
 * -XX:+DoEscapeAnalysis
 * -XX:+EliminateAllocations
 * -XX:+UseTLAB
 * -XX:+PrintGC
 */
public class T01 {

    class User {
        int id;
        String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;

        }
    }

    void alloc(int i) {
        new User(i, "name" + i);
    }

    public static void main(String[] args) {
        T01 t = new T01();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            t.alloc(i);
            //每调用一次alloc就要new一个User对象出来
            //new了一千万个对象花了多少时间
        }
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
    }

}
