
public class Lampe
{
	/** Lampe poseede deux Methodes, allumer et Eteindre.
	 * MAXIME MODIFIE LES COMMENTAIRES
	 */
public boolean estAllumee;
	
public int puissance;

/**Lampe() constructeur par défaut.
 * Puissance = 100
 * Eteinte pas defaut 
 */
public Lampe()
{
	this.estAllumee = false;
	this.puissance = 100;

}

/**Allumer() Allume la lampe
 * 
 */

public void Allume() {
	this.estAllumee = true;	
}


/**Eteindre() Eteind la lampe
 * 
 */
public void Eteindre(){
	this.estAllumee = false;
}

	
}





