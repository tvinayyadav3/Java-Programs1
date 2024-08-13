package Question2;
import java.util.Scanner;

public class CollatzSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		n=20;
			while(n!=1)
			{
				if(n%2==0)
				{
					n=n/2;
					System.out.println(n);
				}
				else if(n%2==1)
				{
					n=3*n+1;
					System.out.println(n);
			    }
		}
	
	}

}



