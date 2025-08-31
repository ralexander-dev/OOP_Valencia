/*
 * Ava Restaurant Class
 * Represents the Ava restaurant
 * Contains attributes and methods specific to the Ava restaurant
 */
public class Ava {
    // Declare 3 fields unique to the restaurant
    private String cuisineType;
    private int seatingCapacity;
    private int customerCount;

    // constructor for class that accepts all fields
    // args: cuisineType (String), seatingCapacity (int), customerCount (int)
    // returns: Ava object
    public Ava(String cuisineType, int seatingCapacity, int customerCount) {
        this.cuisineType = cuisineType;
        this.seatingCapacity = seatingCapacity;
        this.customerCount = customerCount;
    }

    // overloaded constructor for class that sets all fields to 0, or NULL
    // args: None
    // returns: Ava object
    public Ava() {
        this.cuisineType = null;
        this.seatingCapacity = 0;
        this.customerCount = 0;
    }

    // get and set methods for each field
    // set cuisineType
    // args: cuisineType (String)
    // returns: None
    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
    // get cuisineType
    // args: None
    // returns: cuisineType (String)
    public String getCuisineType() {
        return cuisineType;
    }

    // set seatingCapacity
    // args: seatingCapacity (int)
    // returns: None
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    // get seatingCapacity
    // args: None
    // returns: seatingCapacity (int)
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    // set customerCount
    // args: customerCount (int)
    // returns: None
    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }
    // get customerCount
    // args: None
    // returns: customerCount (int)
    public int getCustomerCount() {
        return customerCount;
    }

    // Create a custom method for each restaurant
    // args: None
    // returns: None
    public void printSeatsAvailable() {
        // subtract customerCount from seatingCapacity to get seatsAvailable
        int seatsAvailable = seatingCapacity - customerCount;
        System.out.println("Seats Available: " + seatsAvailable);
    }

    // print method
    // args: None
    // returns: None
    public void printAttrs() {
        System.out.println();
        System.out.println("----- Ava Restaurant Attributes -----");
        System.out.println("Cuisine Type: " + cuisineType);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Customer Count: " + customerCount);
    }
}
