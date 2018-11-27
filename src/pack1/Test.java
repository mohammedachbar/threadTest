package pack1;

	public class Test {
		
		
		
		  public static void main(String[] args) {
		    Compte cb = new Compte();

		    Thread t = new Thread(new TestCompte(cb,"T1"));
		    Thread t2 = new Thread(new TestCompte(cb,"T2"));
		    t.start();
		    t2.start();
		  }
		  
		  
}

