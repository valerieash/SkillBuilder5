
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    private static final int DEFAULT_POWER_LEVEL = 50;
    private int powerLevel;
    /**
     \* Initializes a Grok object to the default power level of 50.
     */

    public Grok(){
        this.powerLevel= DEFAULT_POWER_LEVEL;
    }
    /**
     *
     * Initializes a Grok object to power powerLevel
     */
    public Grok(int powerLevel){
        this.powerLevel = powerLevel;
    }
    /**
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel(){
        return powerLevel;
    }

    /**
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */

    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }


    public void takePowerPill(PowerPill pill){
        this.powerLevel += pill.getPower();
    }
    /**
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
    public void tookHit(){
        this.powerLevel -= 5;
    }


}
