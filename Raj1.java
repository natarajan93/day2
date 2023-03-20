package condition;

public class Raj1 {
	public static void main(String[]args) {
		String a=args[0];		
		if(a.equals("Mr")) {
			System.out.println("MALE");
			
		}
		else if(a.equals("Ms")) {
			System.out.println("FEMALE");
			
		}
		else if(a.equals("Mrs")) {
			System.out.println("WOMAN");
			
		}
		else if(a.equals("Dr"))
		{
			System.out.println("DOCTOR");
			
		}
		else
		{
			System.out.println("Invalid data");
		}
	}

}
