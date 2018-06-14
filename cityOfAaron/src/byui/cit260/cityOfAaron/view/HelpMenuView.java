/* The HelpMenuView class - part of the View layer
 * The object of this class is to manage the Help Menu
 * CIT-260
 * Author: Patricia Struk 
 * Last modified June 2018
 */
package byui.cit260.cityOfAaron.view;

import java.util.Scanner;
/*
 * Lesson 8 Individual Assignment - HelpMenuView Class  Author: Patricia Struk
 */

public class HelpMenuView {
    //Create a scanner object and data member variables
    private static Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
// HelpMenuView() constructor
// Purpose: Initialize the Help Menu data
// Parameters: none
// Returns: none
// ============================================================================
    public HelpMenuView(){
        theMenu = "\n" +
               "**********************************\n" +
               "        * HELP MENU *             \n" +
               "**********************************\n" +
               " 1 - What are the goals of the game?\n" +
               " 2 - Where is the city of Aaron\n" +
               " 3 - How do I view the map?\n" +
               " 4 - How do I move to another location?\n" +
               " 5 - How do I display a list of animals, provisions " + 
                        "and tools in the city storehouse?\n" +
               " 6 - Back to the Main Menu\n";
        max = 6;
    }
    
//  The displayHelpMenuView() method
//  Purpose: To display the help menu, prompt the user for input and retrieve the 
//  input. The program then performs the appropriate action. If an invalid menu 
//  item is entered, the computer displays an error message and redisplays the 
//  help menu. The program terminates when option 6(Back to the Main Menu)is 
//  selected.  
//  Parameters: none 
//  Returns: none 
//  ===========================================================================
    public void displayHelpMenuView() {
        int menuOption;
        do {
    // Display the menu
            System.out.println(theMenu);
    // Prompt the user and get the user’s input
            menuOption = getMenuOption();
    // Perform the desired action
            doAction(menuOption);
    // Determine and display the next view
    // if max is reached loop exits and returns to MainMenuView
        } while(menuOption != max); 
    }

// The getMenuOption() method
// Purpose: gets the user's input
// Parameters: none
// Returns: integer (the user option selected)
// ============================================================================
    public int getMenuOption() {
        // declare a variable to hold user’s input
        int userInput;
        // begin loop
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt(); 
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max) {
                System.out.println("\noption must be between 1 and "+ max);
            }
        // loop back to the top if input was not valid       
        } while(userInput < 1 || userInput > max);
        // return the value input by the user
        return userInput;
    }      

// The doAction() method
// Purpose: performs the selected action
// Parameters: none (an int option)
// Returns: none
// ============================================================================       
    public void doAction(int option){
        switch(option){
            case 1: // answers first help question
                viewGoals();
                break;
            case 2: // answers second help question 
                viewFindAaron();
                break;
            case 3: // answers third help question
                viewMapHelp();
                break;
            case 4: // answers fourth help question
                viewMoveHelp();
                break;
            case 5: // answers fifth help question
                viewListHelp();
                break;
            case 6: //return to Main Menu
                System.out.println("Hope we answered your questions. Now, you will " + 
                    "return back to the Main Menu. Have a pleasant trip!");
            
        }
    }


// The viewGoals()method
// Purpose: Shows the goals of the game help message
// Parameters: none
// Returns: none
// ===========================================================================     
    public void viewGoals(){
        System.out.println("\nThe viewGoals() option has been selected.");
}   
    
// The viewFindAaron() method
// Purpose: Shows where the City of Aaron is in a help message 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewFindAaron(){
        System.out.println("\nThe viewFindAaron() option has been selected.");
 } 
 
// The viewMapHelp() method
// Purpose: Shows the map for the City of Aaron as a help message 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewMapHelp(){
        System.out.println("\nThe viewMapHelp() option has been selected.");
 } 
 
// The viewMoveHelp() method
// Purpose: Shows how to move to another location in a help message
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewMoveHelp(){
        System.out.println("\nThe viewMoveHelp() option has been selected.");
 } 

// The viewListHelp() method
// Purpose: Shows a help message on how to display lists of items in the city storehouse 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewListHelp(){
        System.out.println("\nThe viewListHelp() option has been selected.");
 }     
    
    
    
}// end of class
