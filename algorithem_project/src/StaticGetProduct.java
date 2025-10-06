public class StaticGetProduct{
    static DataBase DataBase = new DataBase();
    public Product convertStringToProduct(String name)
    {
        for(Product p : DataBase.getProducts().values()) 
        {
            if(p.getProduct_name().equals(name))
                return p;
        }
        return null;
    }
    public Product convertIDToProduct(int ID)
    {
        for(Product p : DataBase.getProducts().values())
        {
            if(p.getProduct_ID() == ID)
                return p;
        }
        return null;
    }
}