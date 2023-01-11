package CarsClasses;

public class CarsProductManager {
  public void ekle(CarsProduct carsProduct){
        System.out.println("Ürün Eklendi :"+carsProduct.name);
  }

  public void sil(CarsProduct carsProduct){
        System.out.println("ürün Silindi :"+carsProduct.model);
  }
}
