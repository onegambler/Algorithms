package desing.patterns;


public class Singleton {

    private volatile static Singleton INSTANCE;

    private Singleton() {
        // Initialise some stuff
    }

    /**
     *
     * Lazy, thread safe version. Double checked locking.
     */
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }


    /**
     * Lazy, thread safe, non blocking.
     */
    public static class SingletonContainer {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance2() {
        return SingletonContainer.INSTANCE;
    }
}
