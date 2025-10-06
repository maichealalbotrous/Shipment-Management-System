import java.util.Scanner;

public class showOrders implements OrderMenu {
    static Scanner in = new Scanner(System.in);
    static DataBase dataBase = new DataBase();

    @Override
    public void orderMenu() {
        for (Order order : dataBase.getOrders()) {
            System.out.println("{");
            System.out.println("ID: " + order.getOrder_ID());
            System.out.println("Destination: " + order.getDestination());
            System.out.println("Price: [" + order.getPrice() + "]");
            System.out.println("Date of Order: " + order.getDateOfOrder());
            System.out.println("Products: [");

            for (Product product : order.getProducts()) {
                System.out.println("Name: " + product.getProduct_name());
                System.out.println("Price: " + product.getProduct_price());
                System.out.println("Quantity: " + product.getProduct_quantity());
                System.out.println("---");
            }

            System.out.println("]}");
        }

        new OrderChois().orderMenu();
    }
}