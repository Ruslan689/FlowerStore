package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> buckets;

    public Store() {
        this.buckets = new ArrayList<FlowerBucket>();
    }

    public boolean search(Flower flower) {
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

    public void add(FlowerBucket flowerBucket) {
        buckets.add(flowerBucket);
    }
}
