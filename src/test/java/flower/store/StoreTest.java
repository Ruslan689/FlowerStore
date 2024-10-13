package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit tests for the {@link Store} class.
 */
public class StoreTest {
    /**
     * Price of roses for testing.
     */
    private static final double ROSE_PRICE = 5.0;
    /**
     * Price of tulips for testing.
     */
    private static final double TULIP_PRICE = 3.0;
    /**
     * Quantity of roses for testing.
     */
    private static final int ROSE_QUANTITY = 10;
    /**
     * Quantity of tulips for testing.
     */
    private static final int TULIP_QUANTITY = 20;

    /**
     * Tests searching for existing flowers in the store.
     */
    @Test
    public void testSearchForExistingFlower() {
        Flower rose = new Flower();
        rose.setPrice(ROSE_PRICE);
        rose.setFlowerType(FlowerType.ROSE);

        Flower tulip = new Flower();
        tulip.setPrice(TULIP_PRICE);
        tulip.setFlowerType(FlowerType.TULIP);

        FlowerPack packOfRoses = new FlowerPack(rose, ROSE_QUANTITY);
        FlowerPack packOfTulips = new FlowerPack(tulip, TULIP_QUANTITY);

        FlowerBucket bucket = new FlowerBucket();
        bucket.add(packOfRoses);
        bucket.add(packOfTulips);

        Store store = new Store();
        store.add(bucket);

        Assertions.assertTrue(store.search(rose));
        Assertions.assertTrue(store.search(tulip));
    }

    /**
     * Tests searching for a non-existing flower in the store.
     */
    
    @Test
    public void testSearchForNonExistingFlower() {
        Flower rose = new Flower();
        rose.setPrice(ROSE_PRICE);
        rose.setFlowerType(FlowerType.ROSE);

        Flower chamomile = new Flower();
        chamomile.setPrice(2.0);
        chamomile.setFlowerType(FlowerType.CHAMOMILE);

        FlowerPack packOfRoses = new FlowerPack(rose, ROSE_QUANTITY);

        FlowerBucket bucket = new FlowerBucket();
        bucket.add(packOfRoses);

        Store store = new Store();
        store.add(bucket);

        Assertions.assertFalse(store.search(chamomile));
    }
}
