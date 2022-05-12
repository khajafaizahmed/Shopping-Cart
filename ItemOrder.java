//Faiz Ahmed
//Professor Craig Niiyama
//CS211
//04-22-2022

public class ItemOrder { //stores the information about a particular item and
    //the quantity ordered for that item.
    private final Item item;
    private final int quantity;

    //Constructor that creates an item order for the given item and given quantity. The quantity will be an integer.
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    //Returns the cost for this item order.
    public double getPrice() {
        return item.priceFor(quantity);
    }

    //Returns a reference to the item in this order.
    public Item getItem() {
        return item;
    }

}