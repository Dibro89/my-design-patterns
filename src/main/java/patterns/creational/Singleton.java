package patterns.creational;

public class Singleton {

    private Singleton() {
    }

    public void doStuff() {
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {

        static final Singleton INSTANCE = new Singleton();
    }
}
