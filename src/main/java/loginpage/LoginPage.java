package loginpage;

public class LoginPage {
	
	
	
	public static void main(String arg[]) {
		
	        int numTerms =5;
	        int firstTerm = 0, secondTerm = 1;
	        
	        for (int i = 1; i <= numTerms; i++) {
	            System.out.println(firstTerm + " ");
	            
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	        
	        
	
	}
	
	
	

}
