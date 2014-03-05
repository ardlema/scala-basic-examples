package org.ardlema;

public class JavaSingleton {
    private static JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton() {}

    public static JavaSingleton getInstance() {
        return INSTANCE;
    }
}
