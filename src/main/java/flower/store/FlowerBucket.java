/**
 * Provides classes for flower store management.
 */
package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
/**
 * Represents a bucket that contains multiple flower packs.
 */
@Getter
public class FlowerBucket {
    /**
     * List of flower packs in the bucket.
     */
    private List<FlowerPack> packs;

    /**
     * Constructs an empty flower bucket.
     */
    public FlowerBucket() {
        this.packs = new ArrayList<FlowerPack>();
    }

    /**
     * Calculates the total price of all flower packs in the bucket.
     *
     * @return the total price of the flower packs.
     */
    public double getPrice() {
        double sum = 0;
        for (FlowerPack flowerPack : packs) {
            sum += flowerPack.getPrice();
        }
        return sum;
    }

    /**
     * Adds a flower pack to the bucket.
     *
     * @param flowerPack the flower pack to add.
     */
    public void add(final FlowerPack flowerPack) {
        packs.add(flowerPack);
    }
}
