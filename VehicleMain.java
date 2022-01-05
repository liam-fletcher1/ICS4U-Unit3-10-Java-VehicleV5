/*
 * The Vehicle V5 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2022-01-05
 */

// Import the Scanner class
import java.util.Scanner;

public class VehicleMain {

    /**
     * This program receives and outputs information about a car when prompted.
     */

    public static void main(String[] args) {

        // create scanner object
        Scanner userInput = new Scanner(System.in);

        try {
            // accepts input on bike colour
            System.out.println("Enter the colour you wish your bike to be: ");
            String bcolourChoice = userInput.nextLine();

            // initializing bike with colour choice
            Bike userBike = new Bike(bcolourChoice);

            // accepts input on truck colour
            System.out.println("Enter the colour you wish your truck to be: ");
            String tcolourChoice = userInput.nextLine();

            //initializing truck with colour choice
            Truck userTruck = new Truck(tcolourChoice);

            //printing bike and truck colours as well as number of wheels
            System.out.println();
            System.out.println("Your bikes colour is: " + userBike.getColour());
            System.out.println("Your trucks colour is: " + userTruck.getColour());
            System.out.println();
            System.out.println("Your bikes wheel number is: " + userBike.tireCheck());
            System.out.println("Your trucks wheel number is: " +
                userTruck.tireCheck());
            System.out.println();

            //honking horns
            System.out.println("Honking the horns of the bike and the truck...");
            System.out.println();
            System.out.println("Truck: " + userTruck.callHonk());
            System.out.println("Bike: " + userBike.callBell());
            System.out.println();

            //riding the bike
            System.out.println("You go for a bike ride. How fast would you like" +
                " to bike (km/h)");
            float bikeSpeed = userInput.nextFloat();
            userBike.accelerate(bikeSpeed);

            // printing speed
            System.out.println("You accelerate to " + userBike.currentSpeed() +
                " km/h");

            // printing speed
            System.out.println("Current cadence: " + userBike.getCadence() +
                " RPM");

            // slow down
            System.out.println();
            System.out.println("You begin to decelerate. How many km/h's do you " +
                "slow down by?: ");
            float bikeSlow = userInput.nextFloat();
            userBike.brake(bikeSlow);

            // printing speed
            System.out.println("Your current speed: " + userBike.currentSpeed() +
                " km/h");

            // printing cadence
            System.out.println("Current cadence: " + userBike.getCadence() +
                " RPM");

            // begin truck sequence
            System.out.println();
            System.out.println("You reach your home and begin to drive your truck." +
                " How much do you accelerate by?");
            float truckSpeed = userInput.nextFloat();
            userTruck.accelerate(truckSpeed);

            // printing speed
            System.out.println("You accelerate to " + userTruck.currentSpeed() +
                " km/h");

            // slow down
            System.out.println();
            System.out.println("You begin to decelerate. How many km/h's do you " +
                "slow down by?: ");
            float truckSlow = userInput.nextFloat();
            userTruck.brake(truckSlow);

            // printing speed
            System.out.println("Your current speed: " + userTruck.currentSpeed() +
                " km/h");

            // sequence end
            System.out.println();
            System.out.println("You arrive back home and stop the truck.");

            // catch for general problems like bad user inputs
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
