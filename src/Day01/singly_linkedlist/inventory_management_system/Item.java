package Day01.singly_linkedlist.inventory_management_system;



class Item {
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}