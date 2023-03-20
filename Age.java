package condition;

public class Age {

	public static void main(String[]args) {
		int axis=15;
		int central=20;
		int sbi=25;
		if(axis>central && axis>sbi){
			System.out.println("axis bank is highest precentage");
		}
		else if(central>axis&&central>sbi) {
				System.out.println("central bank is highest precentage");
				
		}
		else
		{
			System.out.println("sbi bank is highest precentage");
		}
		
	}
	}

