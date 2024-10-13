/**
 * Provides unit tests for classes in the flower store package.
 */
package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

/**
 * Unit tests for the {@link Flower} class.
 */

public class FlowerTest {
    /**
     * Random number generator for generating test prices.
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * Maximum price of flowers for testing.
     */
    private static final int MAX_PRICE = 100;
    /**
     * The flower used in tests.
     */
    private Flower flower;

    /**
     * Initializes the test environment by creating a new {@link Flower}.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * Tests the price setting and getting in the {@link Flower}.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * Tests the color setting and getting in the {@link Flower}.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
}
