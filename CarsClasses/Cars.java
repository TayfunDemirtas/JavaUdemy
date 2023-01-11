package CarsClasses;
public class Cars {
    public static void main(String[] args) {
        CarsProduct carsProduct = new CarsProduct();
        carsProduct.name="Mercedes";
        carsProduct.model=2023;
        carsProduct.motor=2200;
        carsProduct.price=500000;
        carsProduct.colors="Black";
        carsProduct.Km=250;

        CarsProductManager carsProductManager = new CarsProductManager();
        carsProductManager.ekle(carsProduct);
        carsProductManager.sil(carsProduct);
    }
}
