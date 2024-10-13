package flower.store;

import lombok.Getter;

/**
 * Represents a pack of flowers with a specified quantity.
 */
@Getter
public class FlowerPack {
    /**
     * The flower in the pack.
     */
    private Flower flower;
    /**
     * The quantity of flowers in the pack.
     */
    private int quantity;

    /**
     * Constructs a FlowerPack with the specified flower and quantity.
     *
     * @param flower the flower in the pack.
     * @param quantity the number of flowers.
     */

    public FlowerPack(final Flower newflower,final int newquantity) {
        this.flower = newflower;
        this.quantity = newquantity;
    }

    /**
     * Calculates the total price of the flower pack.
     *
     * @return the total price based on flower price and quantity.
     */
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    /**
     * Adds more flowers to the pack if they are of the same type.
     *
     * @param newFlower the flower to add.
     * @param amount the number of flowers to add (must be greater than 0).
     */
    public void add(final Flower newFlower, final int amount) {
        if (newFlower.getFlowerType().equals(flower.getFlowerType())) {
            if (amount > 0) {
                quantity += amount;
            } else {
                System.out.println("amount cant be < 0");
            }
        } else {
            System.out.println("cant be another type");
        }
    }
}
