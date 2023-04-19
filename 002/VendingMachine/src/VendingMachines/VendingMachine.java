package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private int volume;
    private ArrayList<Product> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }
    
    public int getVolume() {
    	return this.volume;
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public ArrayList<Product> getProdAll()
    {
        return products;
    }

}