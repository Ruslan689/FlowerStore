package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
@Getter
public class FlowerBucket {
    private List<FlowerPack> packs;

    public FlowerBucket() {
        this.packs = new ArrayList<FlowerPack>();
    }    

    public double getPrice() {
        double sum = 0;
        for (FlowerPack flowerPack : packs) {
            sum += flowerPack.getPrice();
        }
        return sum;
    }

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }
}
