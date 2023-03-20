package condition;

public class greethingtime {
	public static void main(String[]args) {
		int time=23;
		if(time>=6&&time<=11) {
			System.out.println("good mornig");
		}
		else if(time>=12&&time<=15) {
			System.out.println("good noon");
		}
		else if(time>=16&&time<=20) {
			System.out.println("good evening");
		}
		else if(time>=21&&time<=24) {
			System.out.println("good nigth");
		}
		else
		{
			System.out.println("invalid data");
		}



	}

}
