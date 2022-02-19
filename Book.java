

/**
 * Book Class for Product Management System(Project 1)
 * ITSC 1213 Spring 22
 *
 * @author Jacob Smith
 * @version Spring 22
 */

public class Book {

    //Fields for Book Class
    private String name;
    private int quantity;
    private double price;

    /**
     *
     * @return Returns the name of a book
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return Returns the quantity of a certain book in stock
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     *
     * @param x The new quantity value of a book after an order or addition
     * @return Returns the updated quantity
     */
    public int setQuantity(int x){
        return x = this.quantity;
    }

    /**
     *
     * @return Returns the price of a specifc book
     */
    public double getPrice(){
        return this.price;
    }

    /**
     *
     * @param x New price of a specific book
     * @return Returns the new price of a book after a discount or other promotion is applied
     */
    public double setPrice(double x){
        return x = this.price;
    }

    /**
     *
     * @param bookName Name of new Book object
     * @param bookQuant Quantity of new Book object
     * @param bookPrice Price of new Book object
     */
    public Book(String bookName, int bookQuant, double bookPrice){
        name = bookName;
        quantity = bookQuant;
        price = bookPrice;
    }



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
