//Faiz Ahmed
//Professor Craig Niiyama
//CS211
//04-22-2022

import java.util.ArrayList;

public class ShoppingCart {//stores information about the overall order.
    private final ArrayList<ItemOrder> itemOrder;
    private double total = 0;
    private double discount = 0;

    ShoppingCart() {//Constructor creates an empty list of item orders.
        itemOrder = new ArrayList<ItemOrder>();
        total = 0;
    }
    //Sets whether or not this order gets a discount
    public void setDiscount(boolean selected) {//Sets it so that the order gets a discount or not.
        if (selected) {
            discount = total * .1;
        }
    }
    //Returns the total cost of the shopping cart.
    public double getTotal() {//Returns the total cost of the shopping cart.
        total = 0;
        for (ItemOrder order : itemOrder) {
            total += order.getPrice();
        }
        return total - discount;
    }

    public boolean add(ItemOrder order) {
    //Adds an item order to the list, it replaces any previous order for this item with the new order.
        // The parameter will be of type ItemOrder.
        for (int i = 0; i < itemOrder.size(); i++) {
            ItemOrder temp = itemOrder.get(i);
            if ((temp.getItem()).equals(order.getItem())) {
                itemOrder.set(i, order);
                return true;
            }
        }
        itemOrder.add(order);
        return true;
    }

}