package pack1;

public class Compte {
		private int  solde = 100;
        
		public int getSolde () {
			return solde ;
		}
       
		public synchronized void retirer ( int montant ){
			solde = solde - montant ;
			System.out.println("Solde = " + solde);
		}	
}
