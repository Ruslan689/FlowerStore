/**
 * Provides classes for managing the store and its flower inventory.
 */
package flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that holds a collection of flower buckets.
 */
public class Store {
    /**
     * List of flower buckets available in the store.
     */
    private List<FlowerBucket> buckets;

    /**
     * Constructs an empty store.
     */
    public Store() {
        this.buckets = new ArrayList<FlowerBucket>();
    }

    /**
     * Searches for a specific flower type in the store's flower buckets.
     *
     * @param flower the flower to search for.
     * @return true if the flower is found, false otherwise.
     */
    public boolean search(final Flower flower) {
        FlowerType flowerType = flower.getFlowerType();

        if (buckets == null || flowerType == null) {
            return false;
        }

        for (FlowerBucket fBucket : buckets) {
            for (FlowerPack fPack : fBucket.getPacks()) {
                FlowerType packFlowerType = fPack.getFlower().getFlowerType();

                if (flowerType.equals(packFlowerType)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Adds a flower bucket to the store.
     *
     * @param flowerBucket the flower bucket to add.
     */
    public void add(final FlowerBucket flowerBucket) {
        buckets.add(flowerBucket);
    }
}
