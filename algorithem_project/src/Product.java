public class Product {
 private int Product_ID ;
 private String Product_name;
 private double Product_price;
 private int Product_quantity;

 public Product(){};

 public int getProduct_ID() {
    return this.Product_ID;
 }
 public void setProduct_ID(int product_ID) {
    this.Product_ID = product_ID;
 }
 public String getProduct_name() {
    return this.Product_name;
 }
 public void setProduct_name(String product_name) {
    this.Product_name = product_name;
 }
 public double getProduct_price() {
    return this.Product_price;
 }
 
 public void setProduct_price(double product_price) {
    if(product_price < 0)
    {
        System.out.println("sorry...[the price is negative]");
    }else{
        this.Product_price = product_price;
    }
 }
 public int getProduct_quantity() {
    return this.Product_quantity;
 }

 public void setProduct_quantity(int product_quantity) {
   if(product_quantity<= 1000)
   {
     this.Product_quantity = product_quantity;
   }else{
    System.out.println("sorry.....[but the quantity is greater than allowed]");
   }
 }

public String Print() {
    return String.valueOf(Product_ID) + "</N>" + Product_name + "</N>" + String.valueOf(Product_price) + "</N>" +String.valueOf(Product_quantity) + "</N>";
}

 

    
}
