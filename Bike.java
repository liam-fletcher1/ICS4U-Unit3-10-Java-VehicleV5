/*
 * The Vehicle V5 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2022-01-05
 */

public class Bike extends Vehicle {
    // Initializing fields
    private float cadence;
    private int tireNum;

    /**
     * Setting field values with a constructor. Also assigns the pikes colour to
     * a constant in this file.
     */
    public Bike(String bikeColour) {
        super(bikeColour);
        this.colour = bikeColour;
        this.tireNum = 2;
        this.cadence = 0;
    }

    /**
     * Method for finding cadence.
     */
    public float getCadence() {
        cadence = (currentSpeed() * 8);
        return cadence;
    }

    /**
     * method to return tire number.
     */
    public int tireCheck() {
        return tireNum;
    }

    /** 
     * method to ring bell.
     */
    public String callBell() {
        String bell = ("Ring!");
        return bell;
    }

}
