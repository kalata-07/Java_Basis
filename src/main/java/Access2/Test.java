package Access2;

import Access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.publicName="";
        //product.setPrivateName("");
        //product.getPrivateName();

        Glass wineGlass = new Glass();
        wineGlass.publicName="";
        wineGlass.getPrivateName();

        product.makeCalculation();
    }

}
