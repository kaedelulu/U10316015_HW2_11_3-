Account{
	private int id = 0;
	private double balance = 0;	//default balance as 0
	private double annualInterestRate = 0;	//default annualInterestRate as 0
	private double total = 0;	//default total as 0
	private Date date = new Date();	//Store the date when the account was created
	
	//Create Account()
	Account(){
	
	}
	Account( int id , double balance ){
		this.id = id;
		this.balance = balance;
		dateHired = new java.util.Date();
	}
	//methods for the three data fields(getters & setters)
	public int getId(){
		return id;
	}	
	public void setId( int id ){
		this.id = id;
	}
	public double getBalance(){
		return balance;
	}	
	public void setBalance( double balance ){
		this.balance = balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}	
	public void setAnnualInterestRate( double annualInterestRate ){
		this.annualInterestRate = annualInterestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	//Return monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	//Return monthly interest
	public double getMonthlyInterestRate(){
		return getMonthlyInterestRate() * balance;
	}
	
	public double withdraw( double withdraw ){ 
		total -= withdraw;
	}
	public double deposit( double deposit ){ 
		total += deposit;
	}
	//Create toString() method and Override
	public String toString(){
		return "ID : " + id + "\n" + 
				"Balance : " + balance + "\n" +
				"AnnualInterestRate : " + annualInterestRate + "\n" + 
				"Date : " + date + "\n\n";
	}
}
	
