package S3;

public class Ex53 {
	 	

		   public static void main(String[] args) {
		     
				 Ex44 de1 = new Ex44(); /** On cr�e un objet De **/

		       System.out.println("Total On Dice     Average Number of Rolls   Standard Deviation  Max number of rolls");
		       System.out.println("-------------     -----------------------   ------------------  ------------------ ");
		       
		       
		   /** On affiche toutes les possibilit�s des tours de 2 � 12 **/
		       
		       for ( int total=2;  total <= 12; total++ ) {
		    	   
		   /** On d�clare un objet de la classe StatCalc pour appeler 
		    * les fonctions de Average, deviation, max
		    */
		    	   
		    	   StatCalc st1; 
		    	   st1=new StatCalc();
		    	   
		    	   /** On r�p�te l'action 10000 fois */
		    	   
		    	   for (int i = 0; i <10000 ; i++ ) {
		   
		             st1.enter(de1.lancerde(total)); // Lancer le d�
		          }
		     
		          System.out.printf("%10d%22.4f%25f%24.0f\n", total, st1.getMean(),st1.getStandardDeviation(),st1.getMax());
		            
		       }
		   } 
		   
	
			
		} 



