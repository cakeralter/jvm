package cc.caker.jvm.clazz;

import java.security.InvalidParameterException;
import java.time.LocalDateTime;

/**
 * javac TestClass.java
 * javap -verbose TestClass.class
 *
 * @author cakeralter
 * @date 2021/4/11
 * @since 1.0
 */
public class TestClass {

    private int m;

    public int inc() {
        return m + 1;
    }

    public String testSignature(String name, LocalDateTime time, int sort) throws InvalidParameterException {
        if (name == null || name.length() == 0) {
            throw new InvalidParameterException();
        }
        System.out.printf("[%d]%s signature at %s%n", sort, name, time);
        return "ok";
    }

    public static void main(String[] args) {
        System.out.println("words and 987".replaceAll("[a-zA-Z\\+\\.\\s]+", ""));
    }
}
