package StaticDemo;

public class ProductValidator {

    public ProductValidator(){
        System.out.println("Yapıcı blok");
    }
    public boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
