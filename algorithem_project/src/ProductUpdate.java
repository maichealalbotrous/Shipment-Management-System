import java.util.Scanner;

public class ProductUpdate implements Menu {
    static StaticGetProduct staticGetProduct = new StaticGetProduct();
    static Scanner scanner = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    // static AVLTree AVLTree = new AVLTree();
    @Override
    public void Menu() {
        Product toUpdate;
        do {
            System.out.println("Enter the name of the product you want to update:");
            String choice = scanner.next();
            toUpdate = staticGetProduct.convertStringToProduct(choice);
            if (toUpdate != null) {
                System.out.println("Please Enter The new product price : ");
                double price = scanner.nextDouble();
                toUpdate.setProduct_price(price);

                System.out.println("Please Enter The new product Quantity : ");
                int Quantity = scanner.nextInt();
                toUpdate.setProduct_quantity(Quantity);
                DataBase.DeletDataFromProductsFile();
                new AVLTree<Product>().fromTreeMap(DataBase.getProducts());
                new ProductsManagement().Menu();
                return;
            }
            System.out.println("Product not found.");
            new ProductsManagement().Menu();
            return;

        } while (toUpdate == null);

    }
}