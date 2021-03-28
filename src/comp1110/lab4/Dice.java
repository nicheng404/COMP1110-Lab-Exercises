package comp1110.lab4;

import java.util.Random;

public class Dice {
    private final Random r = new Random();

    // Dice bounds (inclusive)
    public int lowerBound; //Lower bound added to make dice more customizable
    public int upperBound; //Maximum limit of dice roll


    public Dice(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    // Adjust the bounds after dice is created
    public void updateLowerBound(int lower){
        lowerBound = lower;
    }

    public void updateUpperBound(int upper){
        upperBound = upper;
    }

    // Find the range of the dice roll
    public int diceRange() {
        return (1+upperBound-lowerBound) ;
    }

    // Roll the dice, resulting in random int between lower and upper bound (inclusive)
    // e.g. a dice roll of between 1 - 3 can produce 1,2 or 3.
    public int rollDice(){
        return upperBound - r.nextInt(this.diceRange()) ;
    }
    public static void main(String[] args) {
        //Test basic dice rolling

        // Create six sided dice (1-6)
        Dice six_sided_dice = new Dice(1,6);

        // Create unusual dice (2-5)
        Dice unusual_dice = new Dice(2,5);

        // Roll 10 times
        for (int i = 0; i < 10; i++){
            System.out.println("(1-6): " + six_sided_dice.rollDice());
            System.out.println("(2-5): " + unusual_dice.rollDice());
        }

        // Update bounds (5-8)
        six_sided_dice.updateLowerBound(5);
        six_sided_dice.updateUpperBound(8);

        // Update bounds (1-10)
        unusual_dice.updateLowerBound(1);
        unusual_dice.updateUpperBound(10);

        // Roll 10 times
        for (int i = 0; i < 10; i++){
            System.out.println("(5-8): " + six_sided_dice.rollDice());
            System.out.println("(1-10): " + unusual_dice.rollDice());
        }
    }




}
