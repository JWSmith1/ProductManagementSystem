
/**
 * DVD Class for Product Management System(Project 1)
 * ITSC 1213 Spring 22
 *
 * @author Jacob Smith
 * @version Spring 22
 */

public class DVD {

    // Data Types for DVDs
    private String name;
    private int quantity;
    private double price;

    /**
     *
     * @return DVD name
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return Quantity in stock for each DVD
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     *
     * @param x new value of quantity after order/ or adding more
     * @return Returns value of new quantity for specific DVD
     */
    public int setQuantity(int x){
        return x = quantity;
    }

    /**
     *
     * @return Price for DVD
     */
    public double getPrice(){
        return this.price;
    }

    /**
     *
     * @param x new price of DVD, for discounts
     * @return Returns new price of DVD
     */
    public double setPrice(double x){
        return x = price;
    }

    /**
     *
     * @param dvdName String name of new DVD
     * @param dvdQuant Quantity of new DVD in stock
     * @param dvdPrice Price of new DVD
     */
    public DVD(String dvdName, int dvdQuant, double dvdPrice){
        name = dvdName;
        quantity = dvdQuant;
        price = dvdPrice;
    }


    @Override
    public String toString() {
        return "DVD{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
