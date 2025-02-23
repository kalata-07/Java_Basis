package Access2;

import Access.Product;

public class Glass extends Product {
    private static final String material = "glass";
    @Override
    protected String getPrivateName() {
        return super.getPrivateName();
    }

    public static void main(String[] args) {
        System.out.println(material);
    }
}
