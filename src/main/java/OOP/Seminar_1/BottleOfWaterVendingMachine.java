package OOP.Seminar_1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private final List<BottleOfWater> products;

    public BottleOfWaterVendingMachine(List<BottleOfWater> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(BottleOfWater product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleOfWater getProduct(String name, int volume){
        for(BottleOfWater product: products){
            if(product != null){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
