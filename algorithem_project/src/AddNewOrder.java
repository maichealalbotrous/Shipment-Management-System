import java.util.Scanner;
import java.time.LocalDate;

public class AddNewOrder implements OrderMenu {
    static DataBase DataBase = new DataBase();
    static Scanner in = new Scanner(System.in);

    @Override
    public void orderMenu() {
        Order Order = new Order();
        int chois;
        do {
            System.out
                    .println("(1): if you want add New  Product To Your Order " + "\n" + "(2):If the Order Completed");
            chois = in.nextInt();
            if (chois != 2) {
                System.out.println("please enter the product id who you want to add");
                new ShowProducts().Menu();
                int ProductId = in.nextInt();
            
                Product ProductFound = new StaticGetProduct().convertIDToProduct(ProductId);

            if (ProductFound != null) {
                Order.setOrders(ProductFound);
            } else {
                System.out.println("The Products Not Found....");
            }
        }
        } while (chois != 2);

        System.out.println("please enter the id:");
        int id = in.nextInt();
        Order.setOrder_ID(id);

        System.out.println("please enter the destination:");
        String destination = in.next();
        Order.setDestination(destination);

        System.out.println("please enter the price:");
        double price = in.nextDouble();
        Order.setPrice(price);

        System.out.println("please enter the dateOfOrder:");
        System.out.println();
        System.out.println("enter the year");
        int year = in.nextInt();
        System.out.println("enter the month");
        int month = in.nextInt();
        System.out.println("enter the Day");
        int Day = in.nextInt();

        LocalDate date = LocalDate.of(year, month, Day);

        Order.setDateOfOrder(date);

        DataBase.setOrders(Order);
        System.out.println("the order added successfully");
        new OrderChois().orderMenu();
    }
}