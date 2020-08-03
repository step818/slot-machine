package com.casino.games;

import java.util.Random;

/* The Reel class contains the random number generator used to provide symbols (front-end) and payout to the player.
 * The Java Math class will be utilized within Reel for its valuable 'random()' method.
 */

class Reel extends SlotMachine {

    // VARIABLES
    private int slotNumber1 = (int) (Math.random() * 100); // 'slotNumber1', 'slotNumber2', and 'slotNumber3' hold the value of the generated numbers upon runtime.
    private int slotNumber2 = (int) (Math.random() * 100); // These variables are generated using Java Math's 'random()' method. By default, the 'random()' method
    private int slotNumber3 = (int) (Math.random() * 100); // is calculated via double. '(int)' is used to cast the double back into an int.

    // GETTER METHODS
    public int getSlotNumber1() { // Provides access to 'slotNumber1'.
        return slotNumber1;
    }
    public int getSlotNumber2() { // Provides access to 'slotNumber2'.
        return slotNumber2;
    }
    public int getSlotNumber3() { // Provides access to 'slotNumber3'.
        return slotNumber3;
    }

    // TODO: Attach relationships from the Symbol class to the randomly generated integers in the Reel class.
    // TODO: (continued) These should be 'if' statements that return Symbols to the SlotMachine class.
}