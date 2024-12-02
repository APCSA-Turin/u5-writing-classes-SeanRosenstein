/**
 * This class represents a dice object
 * 
 * @author Sean Rosenstein
 */
public class Dice {
    /** The amount of sides of the Dice */
    private int sides;

    /** The roll value of the Dice that is between 1 to the amount of sides */
    private int rollValue;

    /** The amount of times the Dice has been rolled */
    private int rollCount;

    /**
     * Instantiates a Dice object.
     *
     * @param sides The sides amount
     */
    public Dice(int sides) {
        this.sides = sides;
        rollCount = 0;
        rollValue = 0;
    }

    /**
     * Returns the amount of sides of the dice.
     *
     * @return The amount of sides of the dice
     */
    public int getSides() {
        return sides;
    }

    /**
     * Returns the roll value of the dice spin
     *
     * @return The roll value of the dice spin
     */
    public int getRollValue() {
        return rollValue;
    }

    /**
     * Returns the total roll count value of the dice spin
     *
     * @return The roll count of the dice spin
     */
    public int getRollCount() {
        return rollCount;
    }

    /**
     * Sets the amount of sides of the dice to a new value
     *
     * @param newSides The new amount of sides of the dice
     */
    public void setSides(int newSides) {
        sides = newSides;
    }

    /**
     * This simulates a roll for the dice object (between 1 - the number of sides)
     * <p>
     * Sets that value to the rollValue
     * Increases the rollCount by 1
     */
    public void roll() {
        int roll = (int) (Math.random() * sides) + 1;
        rollValue = roll;
        rollCount++;
    }
}
