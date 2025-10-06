public class ShowProducts implements Menu {
    static DataBase DataBase = new DataBase();

    @Override
    public void Menu() {

        for (Product Product : DataBase.getProducts().values()) {
            System.out.println("Products [ " + "The Product ID :" + Product.getProduct_ID() + " "
                    + "The Product Name : " + Product.getProduct_name() + " " + "The Product Price is:"
                    + Product.getProduct_price() + "]");
        }

    }

}