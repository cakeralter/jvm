package cc.caker.jvm.clazz.execute;

/**
 * 方法静态解析演示
 *
 * 被invokestatic和invokespecial指令调用的方法，在解析阶段可以确定唯一调用版本，称为"非虚方法"。
 * 包括"静态方法"、"私有方法"、"实例构造器"和"父类方法"。
 * 被final修饰的方法虽然是被invokevirtual指令调用，但也是"非虚方法"。
 *
 * @author cakeralter
 * @date 2021/4/24
 * @since 1.0
 */
public class StaticResolution {

    /**
     * sayHello() 方法只可能属于类型 StaticResolution ，没有任何途径可以覆盖或隐藏这个方法
     * <p>
     * javap -verbose StaticResolution.class
     * <p>
     * invokestatic指令用于调用静态方法，其调用的方法版本在编译时就以常量池项的形式固化在字节码指令的参数中
     */
    public static void sayHello() {
        System.out.println("Hello World");
    }

    /**
     * final修饰的方法虽然是用invokevirtual指令调用，但也是非虚方法
     */
    public final void sayHi() {
        System.out.println("This a final method.");
    }

    public static void main(String[] args) {
        StaticResolution.sayHello();
        StaticResolution resolution = new StaticResolution();
        resolution.sayHi();
    }
}
