package Question6;

public class FizzBuzz {

	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<=num;i++)
		{
			//System.out.println(i);
			if(i%3==0)
			{
				System.out.println(i+"=Fizz");
				
			}
			if(i%5==0)
			{
				System.out.println(i+"=Buzz");
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+"=FizzBuzz");
			}
		}

	}

}
