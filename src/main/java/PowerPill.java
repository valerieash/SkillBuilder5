
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill {
    public static int DEFAULT_POWER = 10;

    int power;
    String name;

    // instance variables
    public PowerPill(String name){
        this.name = name;
        this.power = DEFAULT_POWER;
    }
    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }
    // accessor methods
    public String getName() {
        return name;
    }
    public int getPower(){
        return power;
    }

    // mutator methods


    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
    }

    // toString method

    public String toString(){
        return "PowerPill" + name + " = " + power;
    }

}

