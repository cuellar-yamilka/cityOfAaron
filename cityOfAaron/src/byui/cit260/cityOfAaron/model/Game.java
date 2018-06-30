/*
* The Game() class file for the cityOfAaron project
*CIT-260
*Spring 2018
*Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 * Yamilka
 * Alejandra
 */
public class Game implements Serializable {
    
    private Player thePlayer;
    private CropData cropData = null;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private Map theMap;

    public Game() {
    }
   
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
// the getCrops()method
// Purpose: get a reference to the crop object
// Paramaters: none
// Returns: a reference to a crop object
    
public CropData getCrop() {
    return cropData;
}

// the setCrops()method
// Purpose: store a reference to a crop object
// parameters: a reference to a crop object
// Returns: none

public void setCrop(CropData _cropRef) {
    cropData = _cropRef;
}
   
// the getAnimals method
//Purpose: to retrieve the array list of animals
//Parameters:none
//Returns: a reference to an animal object

public ArrayList<ListItem> getAnimals(){
    return animals;
}

//the setAnimals method
//Purpose: to save a list of animals in an array list
//Parameters: a reference to an animal object list
//Returns: none

public void setAnimals(ArrayList<ListItem> animals){
    this.animals = animals;
}

// the getTools method
//Purpose: to retrieve the array list of tools
//Parameters:none
//Returns: a reference to a tool object
public ArrayList<ListItem> getTools(){
    return tools ;
}


//the setTools method
//Purpose: to save a list of tools in an array list
//Parameters: a reference to a tool object list
//Returns: none
public void setTools(ArrayList<ListItem> tools){
    this.tools = tools;

}

public Map getMap(){
    return theMap;
}

public void setMap(Map theMap){
   this.theMap = theMap; 
    
}
} // end of class
