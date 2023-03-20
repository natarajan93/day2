package condition;

public class Wifi {
public static void main(String[]args) {
	String wifiname=args[0];
	String wifipass=args[1];
	if(wifiname.equals("name")||wifipass.equals("pass")) {
		System.out.println("conected");
		
	}
	else
	{
		System.out.println("not");
	}
}
}
