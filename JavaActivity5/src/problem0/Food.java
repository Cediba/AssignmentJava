package problem0;

import java.lang.reflect.Array;

public class Food extends Product {
    private int foodCalorie;
    private int foodSize;
    private String[] foodIngredients;

    public Food(int productID, String productName, float productPrice,
                String productMadeInCountry, int foodCalorie, int foodSize, String[] foodIngredients) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }
}
