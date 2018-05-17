/*
* The main() class file for the cityOfAaron project
*CIT-260
*Spring 2018
*Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package cityofaaron;

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
    }
    
}
