public class ComItems implements Serializable{ //calvin's
    private static final long serialVersionUID = 12351313553L;
    private String itemName;
    private String code; //item id
    private double price;
    private int stock;

    
    public ComItems(String code){
        this.code = code;
    }
    public ComItems(String itemName, String code, double price, int stock) {
        this.itemName = itemName;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    