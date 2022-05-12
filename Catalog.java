import java.util.ArrayList;

public class Catalog {
    String logName;
    ArrayList<Item> list;

    Catalog(String x) {
        logName = x;
        list = new ArrayList<Item>();

    }

    String getName() {// This returns name of this catalog.
        return logName;
    }

    int size() {//This returns the nums of items in this list.
        return list.size();
    }

    Item get(int i) {//Returns the Item with the given index (0-based).
        return list.get(i);
    }
        // adds item to list
    void add(Item item) {
        list.add(item);
    }
}