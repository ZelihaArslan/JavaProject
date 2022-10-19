package classesWithAttributes;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;
    private String code;

    public Product(int id, String name, String description, double price, int stockAmount, String colour, String code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.colour = colour;
        this.code = code;
    }

    public Product() {
        System.out.println("yapıcı blok");
    }

    private int getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;  //bu class

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
