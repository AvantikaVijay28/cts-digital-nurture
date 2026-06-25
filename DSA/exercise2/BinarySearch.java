public class BinarySearch
{
    static Product binarySearch(Product[] products, int id) 
    {
    int low = 0;
    int high = products.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (products[mid].productId == id)
            return products[mid];
        else if (id < products[mid].productId)
            high = mid - 1;
        else
            low = mid + 1;
    }

    return null;
}
}