package basic;

/**
 * Created by ZJYYY on 2018/4/27.
 * -XX:-DoEscapeAnalysis
 * -XX:-EliminateAllocations
 * -XX:-UseTLAB
 * -XX:+PrintGCDetails
 */
public class T02 {
    public static void main(String[] args) {
        byte [] b = new byte[1024];

    }
}
