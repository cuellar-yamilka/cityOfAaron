/* The CropException Class - part of the exceptions package 
 * This class creates an exception to take care of the CropControl run-time errors 
 * CIT-260
 * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * Last modified: July 04, 2018
 */
package byui.cit260.cityOfAaron.exceptions;


public class CropException extends Exception{
    
    // Default constructor
    // Purpose: initializes data members to default values
    // Parameters: none
    // Returns: none
    public CropException(){}
    
    // Parameterized constructor 
    // Purpose: Initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String string) {
        
        // Passes the error message to the base class constructor
        super(string);
        
    }
} // end of class

