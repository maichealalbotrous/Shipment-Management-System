import java.util.Scanner;
public class OrderSearch implements OrderMenu{
    static DataBase DataBase = new DataBase();
    static Scanner scan = new Scanner(System.in);
    @Override
    public void orderMenu()
    {
        System.out.println("Enter the ID of the order:");
        
            int Order_ID;
            do
            {
                Order_ID = scan.nextInt();
                for(Order eachOrder : DataBase.Orders)
                {
                    if(eachOrder.getOrder_ID() == Order_ID)
                    {
                        System.out.println("The Destination:"+eachOrder.getDestination()+"The Price:" + eachOrder.getPrice()+"The Date:"+eachOrder.getDateOfOrder()+"\n");
                        new OrderChois().orderMenu();
                        return;
                    }
                }
            Order_ID=0;
                System.out.println("OrderID :"+Order_ID+" not found. Try again:");
            }while(Order_ID == 0);
            new OrderChois().orderMenu();
        
    }
}