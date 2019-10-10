package removingDuplicatedCodeInMethodmain;

public class Account {   
   private String name; // instance variable    
   
   private double balance; // instance variable
 


   // Account constructor that receives two parameters    
   public Account (String name, double balance) {
      this.setName(name); // assign name to instance variable name
      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      
      if (balance > 0.0) // if the balance is valid                      
    	  this.balance = balance; // assign it to instance variable balance
      
   } 
   
   // method that deposits (adds) only a valid amount to the balance
   public String withdraw(double withdrawAmount, double balance) {   
	   String message = "";
	   if (withdrawAmount < balance) { // if the withdrawAmount is valid  
		   this.balance = balance - withdrawAmount;// subtract it from the balance		   
		   message = String.format("You have made withdrawal of %.2f%n", withdrawAmount);		   
	   }else {
		   message = String.format("Withdrawal amount exceeded account balance");
	   }
	   
	   return message;      
   }
   
   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) {                                                               
	   if (depositAmount > 0.0) // if the depositAmount is valid  
		   balance = balance + depositAmount; // add it to the balance      
   }
   
   // method returns the account balance
   public double getBalance() {                                   
	   return balance;                  
   }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}                                    
   
   

} // end class Account