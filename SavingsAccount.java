import java.util.Scanner;

SavingsAccount extends Account{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		int id = input.nextInt();
		System.out.print("Enter Balance : ");
		double balance = input.nextDouble();
		Account( id , balance );
		
		System.out.print("Enter Annual Interest Rate : ");
		double annualInterestRate = input.nextDouble();
		setBalance( annualInterestRate );
		
		System.out.print("Enter deposit: ");
		double cost1 = input.nextDouble();
		deposit( cost1 );
		System.out.print("Enter withdraw: ");
		double cost2 = input.nextDouble();
		withdraw( cost2 );
		
		//Create toString() method and Override
		public String toString(){
			return super.toString() + "\n" +
						"Total : " + super.total + "\n";
		}
}

