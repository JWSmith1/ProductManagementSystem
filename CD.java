
/**
 * CD Class for Product Management System(Project 1)
 * ITSC 1213 Spring 22
 *
 * @author Jacob Smith
 * @version Spring 22
 */

public class CD {

    // Fields for CD class
    private String name;
    private int quantity;
    private double price;

    /**
     *
     * @return Returns name of CD
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @param x Value to change quantity for CD
     * @return Returns new quantity of CD
     */
    public int setQuantity(int x){
        return x = quantity;
    }

    /**
     *
     * @return Returns quantity of CD
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     *
     * @param x New Price of CD
     * @return Returns updated price of CD
     */
    public double setPrice(double x){
        return x = price;
    }

    /**
     *
     * @return Returns price of CDs
     */
    public double getPrice(){
        return this.price;
    }

    /**
     *
     * @param cdName Name for CD to add to inventory
     * @param cdQuant Quantity of CD
     * @param cdPrice Price of CD
     */
    public CD(String cdName, int cdQuant, double cdPrice){
        name = cdName;
        quantity = cdQuant;
        price = cdPrice;
    }

    @Override
    public String toString() {
        return "CD{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
