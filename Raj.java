package condition;

public class Raj {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		int per1=Integer.parseInt(a[0]);
		int per2=Integer.parseInt(a[1]);
		int per3=Integer.parseInt(a[2]);
		int per4=Integer.parseInt(a[3]);
		if(per1<per2&&per1<per3&&per1<per3) {
			System.out.println("per1 is highest");
			
			
		}
		if(per2<per1&&per2<per3&&per2<per4) {
			System.out.println("per2 is highest");
			
			
		}
		if(per3<per1&&per3<per2&&per3<per4) {
			System.out.println("per3 is highest");
			
			
		}
		else {
			System.out.println("per4 is highest");
			
		}
		
		
		
	}

}
