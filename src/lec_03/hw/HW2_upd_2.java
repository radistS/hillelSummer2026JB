package lec_03.hw;

/**
 * Further refinement of {@link HW2_upd_1}, calling {@code print} with sample order data.
 */
public class HW2_upd_2 {
    public static void main(String[] args) {
        print(1, "clientName", "productName", 25F, "address");
    }

    /**
     * Prints a single order's details to standard output.
     *
     * @param orderNumber the order number
     * @param clientName the client's name
     * @param productName the ordered product's name
     * @param price the product price in EUR
     * @param address the delivery address
     */
    public static void print(int orderNumber,
                             String clientName,
                             String productName,
                             float price,
                             String address){
        System.out.print("Order No " + orderNumber + " ");
        System.out.println("Client: " + clientName + ".");
        System.out.println("Product: " + productName + ",");
        System.out.println("Price EUR " + price + ".");
        System.out.println("Address:" + address + ".");
    }
}
