/*
 * Author: Russell Alexander
 * Course: Object Oriented Programming 
 * Date Created: September 5th, 2025
 * Program/Problem Description:
 * - Choose a concept that can be represented with inheritance and polymorphism. 
 * - Create a public interface with at least 2 methods that all implementing classes must override. 
 * - Create a parent class that implements the interface. The parent class must include the following:
 *      a) at least 3 fields with at least 2 different data types
 *      b) a constructor
 *      c) get/set methods
 *      d) A method that makes a calculation using user input
 *      e) A method that modifies an object's state or attributes using user input
 *      f) A toString() method
 * - Create 2 child classes that extend the parent class. Each child class must include the following:
 *      a) Override methods from the parent class in a way that reflects thier unique characteristics.
 *      b) Override the toString() method, as well as the 2 custom methods you've created. 
 * - After all classes are created. Create a main application that does the following:
 *      a) Instantiate 5 total objects from any combination of both child classes.
 *      b) Add these objects to an array that uses the parent class as the data type.
 *      c) Print the atttributes of each object in the array.
 *      d) Ask the user to perform each of the overridden methods in the parent class for both types of children. Print the result of each method. 
 */
import java.util.Scanner; // import Scanner to get user input
import java.util.Random; // import Random util for generating random values

public class Main {
    // define main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiate Scanner object
        Random random = new Random(); // instantiate Random object

    
        Phone[] phones = new Phone[5]; // Array to hold 5 Phone objects
        // Populate the array with random subclass instances
        for (int i = 0; i < phones.length; i++) {
            if (random.nextBoolean()) {
                // instantiate Apple phone with random battery percentage, OS version, and FaceID capability
                phones[i] = new Apple(random.nextInt(100), "iOS " + (random.nextInt(1, 10)), random.nextBoolean());
            } else {
                // instantiate Samsung phone with random battery percentage, OS version, and Stylus capability
                phones[i] = new Samsung(random.nextInt(100), "Android " + (random.nextInt(1, 10)), random.nextBoolean());
            }
        }

        // Print attributes of each phone
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }

        // Perform overridden methods on each phone
        int counter = 1; // counter to indicate phone number
        // Loop through each phone in the phones array
        for (Phone phone : phones) {
            System.out.println("Phone #" + counter);
            System.out.print("Enter minutes to charge the phone: ");
            int minutes = scanner.nextInt();
            phone.chargePhone(minutes);

            System.out.print("Do you want to update the device? (true/false): ");
            boolean update = scanner.nextBoolean();
            phone.updateDevice(update);
            
            System.out.println(); 
            counter++;
        }

        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }

        scanner.close();
    }
}