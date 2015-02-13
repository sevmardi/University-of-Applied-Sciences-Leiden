/**
 * @(#)Figuur.java
 *
 *
 * @author rob van den Bosch
 * @version 1.00 2010/6/23
 */
package overerving_abstracte_klasse;
import java.awt.*;

public abstract class Figuur 
{
	
	private Color achtergrondKleur;
	

    public Figuur(Color kleur) 
    {
    	this.achtergrondKleur = kleur;
    }
    
    
    public Color getKleur()
    {
    	return (this.achtergrondKleur);
    }  
    
    	 
    public abstract String getVorm();
    
    public abstract void teken (Graphics g);  
    	  
}