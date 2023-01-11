package ClassProduct;
public class ProductManager {
    public void Add(Product product){
        String ekle = product.getName();
        Double ekle2 = product.getPrice();
        System.out.println(ekle);
        System.out.println(ekle2);
    }
}
