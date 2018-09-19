package designpatterns;

/**
 * Simple Singleton.
 */
public final class Singleton {

    /**
     * Static attribute.
     */
    private static Singleton instance = null;

    /**
     * Private Constructor.
     */
    private Singleton() { }

    /**
     * @return single instance
     */
    public static Singleton instance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
