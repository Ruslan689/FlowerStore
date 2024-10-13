/**
 * Provides classes for the flower store.
 */
package flower.store;

import lombok.Getter;
import lombok.Setter;



/**
 * Represents a flower.
 */
@Setter
public class Flower {
    /**
     * Length of the sepal of the flower.
     */
    @Getter
    private double sepalLength;
    /**
     * Color of the flower.
     */
    private FlowerColor color;
    /**
     * Price of the flower.
     */
    @Getter
    private double price;
    /**
     * Type of the flower.
     */
    @Getter
    private FlowerType flowerType;

    /**
     * Returns the color of the flower as a string.
     *
     * @return String representation of the flower color.
     */
    public String getColor() {
        return color.toString();
    }
}
