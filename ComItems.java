

public class ComItems implements Serializable{ //calvin's
    private static final long serialVersionUID = 12351313553L;
    private String itemName;
    private String iid; //item id
    private double price;
    private int stock;

    
    public ComItems(String iid){
        this.iid = iid;
    }
    public ComItems(String itemName, String iid, double price, int stock) {
        this.itemName = itemName;
        this.iid = iid;
        this.price = price;
        this.stock = stock;
    }

    public ComItems() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "> " + this.itemName+ " ($" + this.price +"    Stock:"+this.stock+ ")";
    }
}

//notes: https://www.youtube.com/watch?v=UweR1ShGlk4&list=PLtDIUAtyP4lhV7CsYfLuIx26UeG4J-ujZ&index=11
//notes 2: https://github.com/Ghadeerof/BookStoreRMI/blob/master/src/bookstorermi/Book.java