import java.util.Scanner;

public class ProductSearch implements Menu {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    @Override
    public void Menu() {
        System.out.println("press(1): if you want to search by ID  ");
        System.out.println("press(2): if you want to search by Name  ");

        int chois = in.nextInt();
        if(chois == 2) {
            String name = null;
            do
            {
                name = in.next();
                Product Product = new StaticGetProduct().convertStringToProduct(name);
                if(Product!= null)
                {
                System.out.println("The Product " +Product.getProduct_name() + " was found");
                                new ProductsManagement().Menu();
                                return;
                }else{
                    System.out.println("The Product wasn't Found");    
                }
            }while(name == null);
        }else if(chois == 1)
        {
            int ID;
            do
            {
                ID = in.nextInt();
                Product Product = new StaticGetProduct().convertIDToProduct(ID);
                if(Product!=null)
                {
                    System.out.println("The Product "+Product.getProduct_name()+" was found"+" "
                    +"[ The Product Price : "+Product.getProduct_price()+" "+
                    "The Produtc Quantity :"+Product.getProduct_quantity()+"]"
                    );
                     new ProductsManagement().Menu();
                                return;
                }else{
                    System.out.println("The Product wasn't Found");
                }
            }while(ID == 0);
        }
    }

}