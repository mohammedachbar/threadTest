package pack1;

public  class TestCompte implements Runnable{

	private Compte cb;
	private String nameThread; 
	
	 public TestCompte(Compte cb, String nameThread){
		    this.cb = cb;
		    this.nameThread=nameThread; 

		  }
	
	public void effectuerRetrait(int montant) {
		if(cb.getSolde()>0){
			cb.retirer(montant);
	        System.out.println("Retrait effectu�");

		}
		else 
		System.out.println("Vous �tes � d�couvert !");
		System.out.println(this.nameThread);
		
	}
	
	
	public void run() {
		
	
	    for(int i = 0; i < 10; i++){
	        effectuerRetrait(10);
	      }                       
	    }               

}

