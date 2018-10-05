import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell itemToBeSold){
        ISell foundItem = null;
        for (ISell item : this.stock){
            if (item == itemToBeSold){
                foundItem = item;
            }
        } this.stock.remove(foundItem);
    }

    public Double calculateTotalPossibleProfit(){
        Double profit = 0.00;
        for (ISell item : this.stock){
            Double itemprofit = item.markup();
            profit += itemprofit;
        }
        return profit;
    }
}
