import java.util.Scanner;
public class ProductDelete implements Menu{
    static StaticGetProduct staticGetProduct = new StaticGetProduct();
    static Scanner scan = new Scanner(System.in);
    static DataBase DataBase = new DataBase();
    // static AVLTree AVLTree = new AVLTree();
    @Override
    public void Menu() {
        Product toDelete;
        do
        {
            System.out.println("Enter the name of the product you want to remove.");
            String choice = scan.next();
            toDelete = staticGetProduct.convertStringToProduct(choice);
            if(toDelete != null)
            {    
                System.out.println(toDelete.getProduct_name() + " removed.");
                DataBase.getProducts().remove(toDelete.getProduct_ID());
                DataBase.DeletDataFromProductsFile();
                new ProductsManagement().Menu();
                return;
            }
            else
                System.out.println("Product not found.");
        }while(toDelete == null);
        new AVLTree<Product>().fromTreeMap(DataBase.getProducts());

    }
}