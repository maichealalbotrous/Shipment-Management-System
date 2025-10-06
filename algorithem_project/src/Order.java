import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements Comparable<Order>{
    private int order_ID;
    private String destination;
    private double price;
    private LocalDate dateOfOrder;
private ArrayList<Product> products = new ArrayList<>();
    
    public Order() {
    }
    public int getOrder_ID() {
        return order_ID;
    }
    
    public String getDestination() {
        return destination;
    }
    public double getPrice() {
        return price;
    }
    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
    
    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
   

       public ArrayList<Product> getProducts() {
        return products;
    }
       public void setOrders(Product Product) {
           products.add(Product) ;
       }

       @Override
    public int compareTo(Order other) {
        
        return this.dateOfOrder.compareTo(other.dateOfOrder);
    }
    
     

}