package ATM_pack;

public class Implementation_class {
	private double balance;
	private double accountNum;
	private String Password;
	private String FirstName;
	private String LastName;
	
	
	
	public   Implementation_class(){
		
	}
	
	public Implementation_class(int AccountNum,  String Firstname, String Lastname,double Balance, String password){
		
		accountNum= AccountNum;
		FirstName= Firstname;
		LastName= Lastname;
		balance= Balance;
		Password= password;
		
	}
	 
	public Implementation_class(int  AccountNumber, String PassWord)
    {
		accountNum =  AccountNumber;
    	Password =  PassWord;
    }
	
	public Implementation_class(int AccountNumber, String lastName, String iFirstName)
    {
		accountNum = AccountNumber;
		LastName = lastName;
		FirstName = iFirstName;
		
	}
	
	
	
	
	public double getBalance(){
		
		return balance;
	}
	
	public double getAccountNum(){
		
		return accountNum;
	}
	
	public void withdraw(double inputUser){
		
		balance -= inputUser;
		
		
	}
	
	public void deposit( double inputUser){
		balance += inputUser;
	}
	
	
	
	public String setPassword(String PASSWord){
		String temp= "";
		temp = Password;
		Password= PASSWord;
		return Password;
		
		
	}
	
	public String getPassword(){
		return Password;
		
	}
	 public double getID()
	    {
	    	return accountNum;
	    }
	    
}
