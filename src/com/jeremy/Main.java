package com.jeremy;

public class Main {

    public static void main(String[] args) {
        // unicode characters: https://unicode-table.com/en/#control-character
        char myChar = '\u00A9';// only can had 1 character
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright sybol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char isReg = '\u00AE';
        System.out.println(myChar + " " + isReg);


    }
}
