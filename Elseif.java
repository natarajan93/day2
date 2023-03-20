package condition;

public class Elseif {
public static void main(String[]args) {
	int tamil=80;
	int english=78;
	int maths=100;
	if(tamil>english&&tamil>maths) {
		System.out.println("tamil is highest");
	}
	if(english>tamil&&english>maths) {
		System.out.println("english is highest");
	}
	else
	{
		System.out.println("maths is highest");
	
	}
}
}
