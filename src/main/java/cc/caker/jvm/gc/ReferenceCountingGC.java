package cc.caker.jvm.gc;

/**
 * Hotspot是否采用引用计数算法测试
 * -XX:+PrintGCDetails
 *
 * @author cakeralter
 * @date 2021/3/28
 * @since 1.0
 */
public class ReferenceCountingGC {

    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[_1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
