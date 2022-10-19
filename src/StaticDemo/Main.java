package StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="";
        product.price=10;

        productManager.add(product);

        ProductValidator validator = new ProductValidator();
        validator.isValid(product);


    }
}
