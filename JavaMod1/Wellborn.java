/*
 * Wellborn Restaurant Class
 * Represents the Wellborn restaurant
 * Contains attributes and methods specific to the Wellborn restaurant
 */
public class Wellborn {
    // declare 3 fields unique to the restaurant
    private boolean isHappyHour;
    private String[] menuItems;
    private String[] reservations;

    // constructor for class that accepts all fields
    // args: isHappyHour (boolean), menuItems (String array), reservations (String array)
    // returns: Wellborn object
    public Wellborn(boolean isHappyHour, String[] menuItems, String[] reservations) {
        this.isHappyHour = isHappyHour;
        this.menuItems = menuItems;
        this.reservations = reservations;
    }

    // overloaded constructor for class that sets all fields to 0, or NULL
    // args: None
    // returns: Wellborn object
    public Wellborn() {
        this.isHappyHour = false;
        this.menuItems = null;
        this.reservations = null;
    }

    // get and set methods for each field
    // set isHappyHour
    // args: isHappyHour (boolean)
    // returns: None
    public void setIsHappyHour(boolean isHappyHour) {
        this.isHappyHour = isHappyHour;
    }
    // get isHappyHour
    // args: None
    // returns: isHappyHour (boolean)
    public boolean getIsHappyHour() {
        return isHappyHour;
    }

    // set menuItems
    // args: menuItems (String array)
    // returns: None
    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }
    // get menuItems
    // args: None
    // returns: menuItems (String array)
    public String[] getMenuItems() {
        return menuItems;
    }

    // set reservations
    // args: reservations (String array)
    // returns: None
    public void setReservations(String[] reservations) {
        this.reservations = reservations;
    }
    // get reservations
    // args: None
    // returns: reservations (String array)
    public String[] getReservations() {
        return reservations;
    }
    
    // custom method for each class
    // args: None
    // returns: None
    public void printHappyHourStatus() {
        if (isHappyHour) {
            System.out.println("Happy Hour is currently active!");
        } else {
            System.out.println("Happy Hour is not active.");
        }
    }

    // print method
    // args: None
    // returns: None
    public void printAttrs() {
        System.out.println();
        System.out.println("----- Wellborn Restaurant Attributes -----");
        System.out.println("Happy Hour: " + isHappyHour);
        System.out.println("Menu Items: " + java.util.Arrays.toString(menuItems).replace("[", "").replace("]", ""));
        System.out.println("Reservations: " + java.util.Arrays.toString(reservations).replace("[", "").replace("]", ""));
    }
}
