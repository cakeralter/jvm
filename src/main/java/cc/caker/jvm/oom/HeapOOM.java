package cc.caker.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存溢出异常测试
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutMemoryError
 *
 * @author cakeralter
 * @date 2021/3/30
 * @since 1.0
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> objectList = new ArrayList<>();
        while (true) {
            objectList.add(new OOMObject());
        }
    }
}
