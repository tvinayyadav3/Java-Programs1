package Question9;

public class NumberCheck {
	public static void main(String []  ar)
	{
		 {
				 NumberPredicate isPositive = (number) -> number > 0;
			     NumberPredicate isNegative = (number) -> number < 0;
			     NumberPredicate isEven = (number) -> number % 2 == 0;
			     int num =3;


			            System.out.println("Number: " +num);
			            System.out.println("positive: " + isPositive.check(num));
			            System.out.println("negative: " + isNegative.check(num));
			            System.out.println("even: " + isEven.check(num));
			            System.out.println();
			}

		

	}

}
