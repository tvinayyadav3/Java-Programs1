package Question10;
public interface Flyable {
	void fly_obj();

}
class Spacecraft{
	public static void main(String [] ar) {
		Flyable obj= () ->{
			System.out.println("Spacecraft");
		};
		obj.fly_obj();
		
	 
	}
}
class Airplane{
	public static void main(String[] ar)
	{
		Flyable obj1= () ->{
			System.out.println("Airplane ");
		};
		obj1.fly_obj();
	}
}
class Helicopter{
public static void main(String[] ar)
{
	Flyable obj2= () ->{
		System.out.println("Helicopter");
	};
	obj2.fly_obj();
}
}
