package accessories;

import behaviours.ISell;

public abstract class Accessory  implements ISell {

    private String accessoryType;
    private Double costPrice;
    private Double sellingPrice;

    public Accessory(String accessoryType, Double costPrice, Double sellingPrice) {
        this.accessoryType = accessoryType;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getAccessoryType() {
        return accessoryType;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Double markup(){
        return sellingPrice - costPrice;
    }
}
