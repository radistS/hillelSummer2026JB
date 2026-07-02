package lec_03.hw;

/**
 * Refactors {@link HW2} to extract a reusable {@code print} method for order details.
 */
public class HW2_upd_1 {
    public static void main(String[] args) {
        int orderNumber = 1;
        String clientName = "Alice";
        String productName = "smartphone";
        float price = 305.99f;
        String address = "Moon Street, 10";

        System.out.print("Order No " + orderNumber + " ");
        System.out.println("Client: " + clientName + ".");
        System.out.println("Product:" + productName + ",");
        System.out.println("Price EUR" + price + ".");
        System.out.println("Adress:" + address + ".");
        System.out.println();
        print(orderNumber, clientName, productName, price, address);

        System.out.println("------");

        orderNumber = 2;
        clientName = "Alex";
        productName = "Laptop";
        price = 999.99f;
        address = "Main str, 1";

        System.out.print("Order No " + orderNumber + " ");
        System.out.println("Client: " + clientName + ".");
        System.out.println("Product:" + productName + ",");
        System.out.println("Price EUR" + price + ".");
        System.out.println("Adress:" + address + ".");
        print(orderNumber, clientName, productName, price, address);



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
    public static void print(int orderNumber, String clientName, String productName, float price, String address){
        System.out.print("Order No " + orderNumber + " ");
        System.out.println("Client: " + clientName + ".");
        System.out.println("Product:" + productName + ",");
        System.out.println("Price EUR" + price + ".");
        System.out.println("Adress:" + address + ".");

    }
}
