public class LinearSearch {

    public static Product searchByName(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        Product result = searchByName(products, "Phone");

        if (result != null) {
            System.out.println("Product found:");
            System.out.println(result);
        } else {
            System.out.println("Product not found");
        }
    }
}