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
     
        System.out.println("The team member name is " + name1 
                        + " and the title is " + title1);
    
    //TEST CODE for CropData class-AUTHOR Patricia Struk - L04 Individual assign.        
        
        CropData cropData = new CropData();
        
        cropData.setYear(3);
        int yearNumber = cropData.getYear();
        System.out.println("The year is " + yearNumber);
        
        cropData.setPopulation(250);
        int populationAmt = cropData.getPopulation();
        System.out.println("The population is " + populationAmt);
        
        cropData.setAcresOwned(30);
        int totalAcresOwned = cropData.getAcresOwned();
        System.out.println("Acres owned is " + totalAcresOwned);
        
        cropData.setCropYield(7);
        int cropYieldTotal = cropData.getCropYield();
        System.out.println("The crop yield is " + cropYieldTotal);
        
        cropData.setWheatInStore(3);
        int wheatInStoreAmt = cropData.getWheatInStore();
        System.out.println("The wheat in store is " + wheatInStoreAmt);
        
        cropData.setNumberWhoDied(4);
        int totalNumberWhoDied = cropData.getNumberWhoDied();
        System.out.println("The number who died is " + totalNumberWhoDied);
        
        cropData.setNewPeople(4);
        int newPeopleAmt = cropData.getNewPeople();
        System.out.println("The number of new people is " + newPeopleAmt);
        
        cropData.setHarvest(7);
        int harvestAmt = cropData.getHarvest();
        System.out.println("The harvest amount is " + harvestAmt);
       
        cropData.setHarvestAfterOffering(5);
        int harvestAfterOfferingAmt = cropData.getHarvestAfterOffering();
        System.out.println("The harvest amount after offerings is " 
                            + harvestAfterOfferingAmt);
        
        cropData.setOffering(10);
        int totalOffering = cropData.getOffering();
        System.out.println("The offering amount is " + totalOffering);
       
        cropData.setOfferingBushels(3);
        int offeringBushelsAmt = cropData.getOfferingBushels();
        System.out.println("The amount of offering bushels is " 
                            + offeringBushelsAmt);
        
        cropData.setPeopleFed(16);
        int totalPeopleFed = cropData.getPeopleFed();
        System.out.println("The number of people fed is " + totalPeopleFed);
        
        cropData.setAcresPlanted(15);
        int totalAcresPlanted = cropData.getAcresPlanted();
        System.out.println("The number of acres planted is " 
                + totalAcresPlanted);
        
        cropData.setNumStarved(1);
        int totalNumStarved = cropData.getNumStarved();
        System.out.println("The number who starved is " + totalNumStarved);
        
        cropData.setEatenByRats(4);
        int amtEatenByRats = cropData.getEatenByRats();
        System.out.println("The amount eaten by rats is " + amtEatenByRats);
        
        cropData.setWheatForPeople(8);
        int wheatForPeopleAmt = cropData.getWheatForPeople();
        System.out.println("The amount of wheat for people is " 
                + wheatForPeopleAmt);
         
    //TEST CODE for Location class - AUTHOR Alejandra Canales - L04 Individual Assignment

        Location location = new Location();
     
        location.setDescription("Washington");
        String whereLocation = location.getDescription();
        System.out.println("The location is " + whereLocation);
    
        location.setSymbol("blank");
        String whatSymbol = location.getSymbol();
        System.out.println("The symbol is " + whatSymbol);
     
    //Test code for ListItem class Author: Yamilka Cuellar-L04 Individual Assig
     
        ListItem menuOption = new ListItem();
     
        menuOption.setName("Animals");
        menuOption.setNumber(1);
     
        String menuOptionName = menuOption.getName();
        int menuOptionNumber = menuOption.getNumber();
     
        System.out.println("The Menu " + menuOptionNumber + " is " 
                            + menuOptionName);
          
    }
                
}
