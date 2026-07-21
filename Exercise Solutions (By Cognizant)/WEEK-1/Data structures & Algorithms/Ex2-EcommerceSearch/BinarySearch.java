import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product searchById(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Bag", "Fashion"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result = searchById(products, 103);

        if (result != null) {
            System.out.println("Product found:");
            System.out.println(result);
        } else {
            System.out.println("Product not found");
        }
    }
}