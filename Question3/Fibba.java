
public class Fibba {

	public static void main(String[] args) {
		int num=3,n1=0,n2=1,n3=0;
		while(n3<=num)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
//				System.out.println(n3);
	    }
		if(n3==num)
		{
			System.out.println("it is in fibb series");
		}
		else if(n3!=num)
		{
			System.out.println("Its not");
		}

}
}
