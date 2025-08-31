/***************************************************************************************************
 * Author: Russell Alexander
 * Course: Object Oriented Programming
 * Date: 2025-08-29
 * Description:
 *  - Create 2 restaurant classes
 *      - For each class:
 *          - create 3 unique fields
 *          - create a custom method, a constructor, an overloaded constructor nullifying all fields, 
 *            get/set methods for each field, and a print method.
 *  - Create an application that will contain the Main method performing the following:
 *      - Instantiate each restaurant class
 *      - Call the print method for each restaurant
 *      - Change an attribute of each restaurant
 *      - Call the print method again for each restaurant
 * Inputs: None
 * Outputs: Printed field values of each restaurant before and after changes
 *************************************************************************************************/
import java.time.LocalTime; // import LocalTime

// Main Restaurant Application Class
public class ResturauntApp {
    // define main method
    public static void main(String[] args) {
        // Get the current hour of the day (0-23), later used to determine value for wellborn.happyHour
        int currentHour = LocalTime.now().getHour();
        
        // Create an instance of Ava using the constructor
        Ava ava = new Ava("Mediterranean", 100, 75);

        // Create an instance of Wellborn using the overloaded constructor
        Wellborn wellborn = new Wellborn();
        // Set values using setter methods
        wellborn.setIsHappyHour(currentHour >= 17 && currentHour < 20);
        wellborn.setMenuItems(new String[]{"Burger", "Fries", "Salad"});
        wellborn.setReservations(new String[]{"John", "Jane"});
        
        // Print attributes for each restaurant
        ava.printAttrs();
        System.out.println(); // Blank line for readability
        wellborn.printAttrs();

        // Change an attribute of each restaurant
        ava.setCustomerCount(80);
        wellborn.setReservations(new String[]{"Billy", "Bob"});

        // Print updated attributes for each restaurant
        ava.printAttrs();
        System.out.println(); // Blank line for readability
        wellborn.printAttrs();
    }
}
