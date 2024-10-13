package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack() {
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public void add(Flower newFlower, int amount) {
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
