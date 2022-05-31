package weekthree;

public class Axisbank extends Bankinfo {
	
	
	public void deposit() {
		
		System.out.println("My deposit amount is 2,00,000 rupees");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axisbank axis = new Axisbank();
			
		axis.deposit();
		axis.fixed();
		axis.saving();
	}

}
