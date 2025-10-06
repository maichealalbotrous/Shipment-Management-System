import java.util.Scanner;

public class HomePage implements OrderMenu {
    
    static Scanner in = new Scanner(System.in);
    public HomePage(){}
    @Override
    public void orderMenu() {
        System.out.println("press(1):if you want add order"+"\n"+"press(2): if you want add products");
        int chois = in.nextInt();
        if(chois == 1)
        {
            new OrderChois().orderMenu();
        }
        if(chois == 2){
        new ProductsManagement().Menu();
        }
    };
    
}
