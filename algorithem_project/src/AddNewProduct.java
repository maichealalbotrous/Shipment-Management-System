import java.util.Scanner;

public class AddNewProduct implements Menu {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    // static AVLTree AVLTree = new AVLTree();
    @Override
    public void Menu() {
        Product Product = new Product();
        System.out.println("Please Enter The product ID : ");
        int ID = in.nextInt();
        Product.setProduct_ID(ID);

        System.out.println("Please Enter The product name : ");
        String name = in.next();
        Product.setProduct_name(name);

        System.out.println("Please Enter The product price : ");
        double price = in.nextDouble();
        Product.setProduct_price(price);

        System.out.println("Please Enter The product Quantity : ");
        int Quantity = in.nextInt();
        Product.setProduct_quantity(Quantity);

        DataBase.setProducts(ID, Product);
        new AVLTree<Product>().fromTreeMap(DataBase.getProducts());
        DataBase.saveProducts();
        new ProductsManagement().Menu();
    }
}
