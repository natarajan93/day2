package condition;

public class UseDoor {
	public static void main(String[]args) {
		Door door=new Door();
		String[] a=args[0].split(",");
		door.color=a[0].toUpperCase();
		door.materialType=a[1].toUpperCase();
		door.isSmartLockType=Boolean.parseBoolean(a[2]);
		door.add=door.color+door.materialType;
		door.length=door.add.length();
		System.out.println(door.color+door.materialType+door.isSmartLockType+door.length);
	}

}
