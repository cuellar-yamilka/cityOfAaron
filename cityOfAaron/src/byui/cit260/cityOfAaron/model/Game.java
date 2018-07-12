/*
* The Game() class file for the cityOfAaron project
* CIT-260
* July 12, 2018
* Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Patricia
 * Yamilka
 * Alejandra
*/
public class Game implements Serializable {
    
    private Player thePlayer;
    private CropData cropData = null;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
    private Map theMap;
    private final boolean done = false;
    
    public Game() {
    }
   
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
// The getCrops()method
// Purpose: get a reference to the crop object
// Paramaters: none
// Returns: a reference to a crop object
//=============================================================================    
public CropData getCrop() {
    return cropData;
}

// The setCrops()method
// Purpose: store a reference to a crop object
// parameters: a reference to a crop object
// Returns: none
//=============================================================================
public void setCrop(CropData _cropRef) {
    cropData = _cropRef;
}
   
// The getAnimals method
// Purpose: to retrieve the array list of animals
// Parameters:none
// Returns: a reference to an animal object
//=============================================================================
public ArrayList<ListItem> getAnimals(){
    return animals;
}

// The setAnimals method
// Purpose: to save a list of animals in an array list
// Parameters: a reference to an animal object list
// Returns: none
//=============================================================================
public void setAnimals(ArrayList<ListItem> animals){
    this.animals = animals;
}

// The getTools method
// Purpose: to retrieve the array list of tools
// Parameters:none
// Returns: a reference to a tool object
//=============================================================================
public ArrayList<ListItem> getTools(){
    return tools ;
}

// The setTools method
// Purpose: to save a list of tools in an array list
// Parameters: a reference to a tool object list
// Returns: none
//=============================================================================
public void setTools(ArrayList<ListItem> tools){
    this.tools = tools;

}

// Individual assignment Lesson 10 Author: Yamilka Cuellar

// The getProvisions method
// Purpose: to retrieve the array list of provisions
// Parameters:none
// Returns: a reference to a provisions object
//=============================================================================
public ArrayList<ListItem> getProvisions(){
    return provisions ;
}

// The setProvisions method
// Purpose: to save a list of tools in an array list
// Parameters: a reference to a provisions object list
// Returns: none
//=============================================================================
public void setProvisions(ArrayList<ListItem> provisions){
    this.provisions = provisions;

}

public Map getMap(){
    return theMap;
}

public void setMap(Map theMap){
   this.theMap = theMap; 
    
}
} // end of class
