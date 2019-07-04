package problem0;

public class Cloth extends Product {
    private String[] clothMaterials;

    public Cloth(int productID, String productName, float productPrice, String productMadeInCountry,String[]clothMaterials) {
        super(productID, productName, productPrice, productMadeInCountry);

        this.clothMaterials = clothMaterials;
    }
}
