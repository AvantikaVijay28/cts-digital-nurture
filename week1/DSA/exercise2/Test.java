public class Test 
{

    public static void main(String[] args) 
    {

        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        Product p1 = LinearSearch.search(products, 103);

        if (p1 != null)
            System.out.println("Found: " + p1.productName);

        Product p2 = BinarySearch.binarySearch(products, 104);

        if (p2 != null)
            System.out.println("Found: " + p2.productName);
    }
}