package weekthree;

public class Students {
	
	
	public void getStudentInfo(int id) {
				
		System.out.println("My Identification number is " + (id));
			
	}
	

	public void getStudentInfo(int id, String name) {
		

				
		System.out.println("My Identification number is " + (id));
		System.out.println("My Name is " + (name));
			
	}
	
	public void getStudentInfo(String email,long phone) {
		

		
		System.out.println("My Email id is " + (email));
		System.out.println("My Phone Number is " + (phone));
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Students stu = new Students();
		stu.getStudentInfo(1001);
		stu.getStudentInfo(1002, "Latha");
		stu.getStudentInfo("llathu2005@gmail.com",6474506782L );

	}

}
