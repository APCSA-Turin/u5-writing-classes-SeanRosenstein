public class Dice {
   private int sides;
   private int rollVal;
   private int rollCount;


   public Dice(int sides) {
       this.sides = sides;
       rollVal = 0;
       rollCount = 0;
   }


   public int getSides() {
       return sides;
   }


   public int getRollValue() {
       return rollVal;
   }


   public int getRollCount() {
       return rollCount;
   }


   public void setSides(int newSides) {
       sides = newSides;
   }


   public void roll() {
       int roll = (int) (Math.random() * sides) + 1;
       rollVal = roll;
       rollCount++;
   }
}
