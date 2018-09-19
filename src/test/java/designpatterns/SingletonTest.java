package designpatterns;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for Singleton.
 */
public final class SingletonTest {

    /**
     * Single instantiation.
     */
    @Test
    void firstInvocation() {
        assertNotEquals(null, designpatterns.Singleton.instance());
    }

    /**
     * Instantiates twice.
     */
    @Test
    void secondInvocation() {
        Singleton first = Singleton.instance();
        Singleton second = Singleton.instance();
        assertEquals(first, second);
    }
}
