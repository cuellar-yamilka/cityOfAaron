/* The MenuView class - base abstract class for all menu views
 * CIT-260
 * Authors: Patricia Struk, Yamilka Cuellar, Alejandra Canales
 * Last modified June 20, 2018
 */
package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

public abstract class MenuView implements ViewInterface{

    // The data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in);
    protected String menu;  //This string holds the menu string
    protected int max;  //This int holds the max input value
    
    // MenuView Constructor
    // Purpose: Initialize the view object with the menu string
    // Parameters: The menu string and the max value
    // Returns: none
    //=========================================================================

    public MenuView(String _menu, int _max) {
        menu = _menu;
        max = _max;
    }    
    
//The displayMenuView method
//Purpose: displays the menu, gets the user's input, and does the selected action
//Parameters: none
//Returns: none
//=====================================================================    
    
@Override public void displayMenu(){
    // Execute this loop as long as the selected option is not max
    int menuOption = 0;
    do{
        //Display the menu
        System.out.println(menu);
        
        //Prompt the user and get the user's input
        menuOption = getMenuOption();
        
        //Perform the desired action
        doAction(menuOption);
        
    //Determine and display the next view
    } while (menuOption != max);
   
}

// The getMenuOption method
// Purpose: gets the user's input, make sure it is within range
// Parameters: none
// Returns: the user input between 1 and the max value 
// ======================================================================
@Override public int getMenuOption(){
    //declare a variable to hold user's input
    int inputValue = 0;
    
    //begin loop
    do {
        // get user input from the keyboard
        System.out.format("\nPlease enter an option(1 - %d):", max);
        inputValue = keyboard.nextInt();
        
        // if it is not a valid value, output an error message 
        if(inputValue < 1 || inputValue > max)
        {
            System.out.format("\nError: input value must be between 1 and %d.", max);        
        }
        
        // loop back to the top if input was not valid
        } while(inputValue < 1 || inputValue > max);
    
        // return the value input by the user
        return inputValue;
}
    
}//end class
