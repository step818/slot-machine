package com.casino.games;

public enum Symbol { // Each Enum value is assigned to a special character that will display on the console window when the Reel class is utilized.
    AT("@"),
    HASH("#"),
    COLON(":"),
    QUESTION("?"),
    PERCENT("%"),
    AMPERSAND("&"),
    BANG("!"),
    SEVEN("7"),
    GOLD("G"),
    DOLLAR("$");

    private String charAssignment; // Variable to hold the assigned character.

    Symbol(String charAssignment) { // The enum method that passes in 'charAssignment' and assigns it.
        this.charAssignment = charAssignment;
    }

    public String toString() { // This method converts 'charAssignment' to a String (such as @, #, :, etc.) and returns it.
        return this.charAssignment;
    }

    // BOOM BADA POW! Hope this works, or I'm fired!
}