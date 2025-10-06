import java.util.Scanner;
public class OrderChois implements OrderMenu {
    static Scanner in =new Scanner(System.in);

OrderMenu[] MenuOperation = new OrderMenu[] {
    new AddNewOrder(),
    new OrderSearch(),
    new OrderEdit(),
    new showOrders()
};

    @Override
    public void orderMenu() {
        int chois;
        do
        {
            System.out.println("(1):if you want add Order");
            System.out.println("(2):if you want search Order");
            System.out.println("(3):if you want update the date of an Order");
            System.out.println("(4):show Orders");
            System.out.println("(5):Exit");
            chois = in.nextInt();
            MenuOperation[chois-1].orderMenu();
        }while(chois != 5);
    }
}