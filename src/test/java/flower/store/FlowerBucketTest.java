/**
 * Provides unit tests for classes in the flower store package.
 */
package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

/**
 * Unit tests for the {@link FlowerBucket} class.
 */
public class FlowerBucketTest {
    /**
     * Random number generator for generating test values.
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * Maximum quantity of flowers for testing.
     */
    private static final int MAX_QUANTITY = 1000;
    /**
     * Maximum price of flowers for testing.
     */
    private static final int MAX_PRICE = 100;

    /**
     * The flower bucket used in tests.
     */
    private FlowerBucket flowerBucket;

    /**
     * Initializes the test environment by creating a new {@link FlowerBucket}.
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    /**
     * Tests the price calculation in the {@link FlowerBucket}.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
