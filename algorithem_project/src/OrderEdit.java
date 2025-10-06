import java.time.LocalDate;
import java.util.Scanner;

public class OrderEdit implements OrderMenu {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    @Override
    public void orderMenu() {
        System.out.println("please enter the: (Order_ID) you want to edit it");
        int OrderId = in.nextInt();
        for (Order eachOrder : DataBase.getOrders()) {
            if (eachOrder.getOrder_ID() == OrderId) {
                System.out.println("please enter a new date" + "\n" +
                        "enter the year");
                int year = in.nextInt();
                System.out.println("enter the month");
                int month = in.nextInt();
                System.out.println("enter the day");
                int day = in.nextInt();
                LocalDate date = LocalDate.of(year, month, day);
                eachOrder.setDateOfOrder(date);
                break;
            }

        }
        new OrderChois().orderMenu();

    }

}
