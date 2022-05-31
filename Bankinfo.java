package weekthree;

public class Bankinfo {
	
	public void saving() {
		System.out.println("My Savings account");
	}

	
	public void fixed() {
		System.out.println("My Fixed deposit in Savings account");
	}
	
	public void deposit() {
		System.out.println("My deposit amount is 1,00,000 rupees");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bankinfo bank = new Bankinfo();
		
		bank.deposit();
		bank.fixed();
		bank.saving();

	}

}
