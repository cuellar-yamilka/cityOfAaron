/*
* The main() class file for the cityOfAaron project
*CIT-260
*Spring 2018
*Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.CropData;
import byui.cit260.cityOfAaron.model.ListItem;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.TeamMember;

/**
 *
 * @author clami
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Player thePlayer = new Player();
     
     thePlayer.setName("John");
     
     String thePlayerName = thePlayer.getName();
     System.out.println("The name is " + thePlayerName);
     
     String name1 = TeamMember.ALEJANDRA.getName();
     String title1 = TeamMember.ALEJANDRA.getTitle();
     
     System.out.println("The team member name is " + name1 + " and the title is "
             + title1);
    
    //TEST CODE for CropData class - AUTHOR Patricia Struk - L04 Individual assign.        
        
     CropData year = new CropData();
     year.setYear(3);
     int yearNumber = year.getYear();
     System.out.println("The year is " + yearNumber);
        
     CropData population = new CropData();
     population.setPopulation(250);
     int populationAmt = population.getPopulation();
     System.out.println("The population is " + populationAmt);
       
     CropData acresOwned = new CropData();
     acresOwned.setAcresOwned(30);
     int totalAcresOwned = acresOwned.getAcresOwned();
     System.out.println("Acres owned is " + totalAcresOwned);
        
     CropData cropYield = new CropData();
     cropYield.setCropYield(7);
     int cropYieldTotal = cropYield.getCropYield();
     System.out.println("The crop yield is " + cropYieldTotal);
        
     CropData wheatInStore = new CropData();
     wheatInStore.setWheatInStore(3);
     int wheatInStoreAmt = wheatInStore.getWheatInStore();
     System.out.println("The wheat in store is " + wheatInStoreAmt);
        
     CropData numberWhoDied = new CropData();
     numberWhoDied.setNumberWhoDied(4);
     int totalNumberWhoDied = numberWhoDied.getNumberWhoDied();
     System.out.println("The number who died is " + totalNumberWhoDied);
        
     CropData newPeople = new CropData();
     newPeople.setNewPeople(4);
     int newPeopleAmt = newPeople.getNewPeople();
     System.out.println("The number of new people is " + newPeopleAmt);
        
     CropData harvest = new CropData();
     harvest.setHarvest(7);
     int harvestAmt = harvest.getHarvest();
     System.out.println("The harvest amount is " + harvestAmt);
        
     CropData harvestAfterOffering = new CropData();
     harvestAfterOffering.setHarvestAfterOffering(5);
     int harvestAfterOfferingAmt = harvestAfterOffering.getHarvestAfterOffering();
     System.out.println("The harvest amount after offerings is " 
                        + harvestAfterOfferingAmt);
        
     CropData offering = new CropData();
     offering.setOffering(2);
     int totalOffering = offering.getOffering();
     System.out.println("The offering amount is " + totalOffering);
        
     CropData offeringBushels = new CropData();
     offeringBushels.setOfferingBushels(3);
     int offeringBushelsAmt = offeringBushels.getOfferingBushels();
     System.out.println("The amount of offering bushels is " 
                        + offeringBushelsAmt);
        
     CropData peopleFed = new CropData();
     peopleFed.setPeopleFed(16);
     int totalPeopleFed = peopleFed.getPeopleFed();
     System.out.println("The number of people fed is " + totalPeopleFed);
        
     CropData acresPlanted = new CropData();
     acresPlanted.setAcresPlanted(15);
     int totalAcresPlanted = acresPlanted.getAcresPlanted();
     System.out.println("The number of acres planted is " 
                        + totalAcresPlanted);
        
     CropData numStarved = new CropData();
     numStarved.setNumStarved(1);
     int totalNumStarved = numStarved.getNumStarved();
     System.out.println("The number who starved is " + totalNumStarved);
        
     CropData eatenByRats = new CropData();
     eatenByRats.setEatenByRats(4);
     int amtEatenByRats = eatenByRats.getEatenByRats();
     System.out.println("The amount eaten by rats is " + amtEatenByRats);
       
     CropData wheatForPeople = new CropData();
     wheatForPeople.setWheatForPeople(8);
     int wheatForPeopleAmt = wheatForPeople.getWheatForPeople();
     System.out.println("The amount of wheat for people is " 
                        + wheatForPeopleAmt);
            
     //TEST CODE for Location class - AUTHOR Alejandra Canales - L04 Individual Assignment

     Location description = new Location();
     description.setDescription("Washington");
     String whereLocation = description.getDescription();
     System.out.println("The location is " + whereLocation);
     
     Location symbol = new Location();
     symbol.setSymbol("blank");
     String whatSymbol = symbol.getSymbol();
     System.out.println("The symbol is " + whatSymbol);
     
     //Test code for ListItem class Author: Yamilka Cuellar-L04 Individual Assig
     
     ListItem menuOption = new ListItem();
     menuOption.setName("Animals");
     menuOption.setNumber(1);
     
     String menuOptionName = menuOption.getName();
     int menuOptionNumber = menuOption.getNumber();
     
     System.out.println("The Menu " + menuOptionNumber + " is " + menuOptionName); 
    }
                
}
