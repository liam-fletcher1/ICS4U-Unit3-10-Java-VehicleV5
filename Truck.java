/*
 * The Vehicle V5 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2022-01-05
 */

public class Truck extends Vehicle {
    // Initializing fields
    private String plateNum;
    private int tireNum;

    /**
     * Setting field values with a constructor. Also assigns the trucks colour
     * to a constant in this subclass
     */
    public Truck(String truckColour) {
        super(truckColour);
        this.colour = truckColour;
        this.tireNum = 4;
        this.plateNum = "";
    }

    /**
     * This setter sets the plate number of the truck.
     */
    public void setPlates(String userPlateNum) {
        this.plateNum = userPlateNum;
    }

    /**
     * This getter gets the plate number of the truck.
     */
    public String getPlates() {
        return plateNum;
    }

    /**
     * method to return tire number.
     */
    public int tireCheck() {
        return tireNum;
    }

    /**
     * method to return the honking noise of the truck.
     */
    public String callHonk() {
        String honkNoise = ("HONK!");
        return honkNoise;
    }
}
