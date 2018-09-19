package designpatterns;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for Singleton.
 */
public final class SingletonTest {

    /**
     * Simple instantiation.
     */
    @Test
    void singletonTest() {
        assertNotEquals(null, designpatterns.Singleton.instance());
    }
}
