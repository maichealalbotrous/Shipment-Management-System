import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;


public class DataBase {
   static TreeMap <Integer,Product> Products = new TreeMap<>();
   static PriorityQueue <Order> Orders = new PriorityQueue<>();

       File ProductFile = new File("data/Products.txt");
         public DataBase ()
         {
            try {
               getProductsdata();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
  

public void saveProducts() {
    String text = "";
    for (Product product : Products.values()) { 
        text += product.Print() + "<NewUser/>";
    }
    System.out.println("the user was saved");
    try {
        PrintWriter datasave = new PrintWriter(ProductFile);
        datasave.print(text);
        datasave.close();
    } catch (Exception e) {
        System.err.println(e.toString());
    }
}



     public void getProductsdata() throws IOException {
        String text = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(ProductFile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text += s1;
            }

            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                String[] a2 = s.split("</N>");
                if (a2.length >= 0) {
                  Product Product = new Product();
                  Product.setProduct_ID(Integer.parseInt(a2[0]));
                  Product.setProduct_name(a2[1]);
                  Product.setProduct_price(Double.parseDouble(a2[2]));
                  Product.setProduct_quantity(Integer.parseInt(a2[3]));
                  Products.put(Integer.parseInt(a2[0]), Product);

                } else {
                    System.err.println("Invalid data format: " + s);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }
    }




    public void DeletDataFromProductsFile() {
        String text = "";
        for (Product p : Products.values()) {
            text += p.Print() + "</NewUser>";
        }
        File file = new File("data/Products.txt");
        try {
            PrintWriter pr = new PrintWriter(new FileWriter(file));
            pr.print(text);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   public static TreeMap<Integer, Product> getProducts() {
      return Products;
   }
   
   public PriorityQueue<Order> getOrders() {
      return Orders;
   }
   
   public void setOrders(Order order) {
      Orders.add(order);
   }

   public static void setProducts(int key ,Product p) {
     Products.put(key, p);
   } 
}