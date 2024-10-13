package flower.store;

/**
 * Enum representing different flower colors.
 */
public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    /**
     * String representation of the flower color in hex format.
     */
    private final String stringRepresentation;

    /**
     * Constructor for FlowerColor enum.
     *
     * @param newstringRepresentation the hex code representing the color.
     */
    FlowerColor(final String newstringRepresentation) {
        this.stringRepresentation = newstringRepresentation;
    }

    /**
     * Returns the string representation (hex code) of the flower color.
     *
     * @return the hex code as a string.
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
