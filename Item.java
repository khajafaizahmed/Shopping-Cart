//Faiz Ahmed
//Professor Craig Niiyama
//CS211
//04-22-2022

import java.text.NumberFormat;

public class Item {//name and price.

    private final String name;
    private final double price;
    private int bulkQuantity;
    private double bulkPrice;

    // Constructor that takes a name and a single-item price and a bulk quantity and a bulk price as arguments.
// The name will be a String and the quantity will be an integer and the prices will be doubles.
// Should throw an IllegalArgumentException if any number is negative.
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

    }

    //Constructor that takes a name and a price as arguments.  The name will be
    //a String and the price will be a double. Should throw an
    //IllegalArgumentException is price is negative.
    public Item(String name, double price) {//
        if (price < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.price = price;

    }
    //Returns the price for a given quantity of the item.

    public double priceFor(int quantity) {
        double orgPrice = 0;
        if (quantity < 0) {
            throw new IllegalArgumentException();//throws an IllegalArgumentException if quantity is negative.
        } else {
            if (bulkQuantity != 0) {
                orgPrice = (quantity / bulkQuantity) * bulkPrice + (quantity % bulkQuantity) * price;
            } else {
                orgPrice = quantity * price;
            }
        }

        return orgPrice;

    }

    public boolean equals(Item ietm) {
        return this.name.equals(ietm.name);
    }

    public String toString() {
        //Returns a String representation of this item: name followed by a comma and space followed by price. If this has a bulk price,
        // then you should append an extra space and a parenthesized description of the bulk pricing that has the bulk quantity, the word “for” and the bulk price.
        NumberFormat format = NumberFormat.getCurrencyInstance();

        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);
        String x = "";
        x = name + ", " + format.format(price);
        if (bulkPrice != 0) {
            x += " ( " + bulkQuantity + " for " + format.format(bulkPrice) + " )";
        }
        return x;
    }
}