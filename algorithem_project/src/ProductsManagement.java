import java.util.Scanner;

public class ProductsManagement implements Menu {

    Scanner in = new Scanner(System.in);

    Menu[] MenuOperation = new Menu[] {
            new AddNewProduct(),
            new ProductSearch(),
            new ProductUpdate(),
            new ProductDelete(),
            new ShowProducts(),

    };

    @Override
    public void Menu() {
        int chois;
        do {
            System.out.println("Press(1):To Add New Product " + "\n" +
                    "Press(2):To Search For The Product" + "\n" +
                    "Press(3):To Update THe Product" + "\n" +
                    "Press(4):To Delete The Product" + "\n" +
                    "Press(5):To Show All The Products" +"\n"+
                    "Press(6):To Exit");

            chois = in.nextInt();
            MenuOperation[chois - 1].Menu();

        } while (chois != 6);

    }

}