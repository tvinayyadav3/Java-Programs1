package Question8;

public class Employee {
	

	String empName;
   int salary;
    String role;
	Employee(String empName,String role)
	{
		this.empName=empName;
		this.role=role;
		System.out.println("Name: "+empName+" "+"Role: "+role);
		}
	int calculateSalary(int salary)
	{
		 salary=12*salary;
		 return salary;
	}
public class Manager extends Employee{
	public Manager(String empName, String role) {
		super(empName, role);

	}
	int calculateSalary(int salary)
	{
		return super.calculateSalary(salary);
		 
	}
}
public class Programmer  extends Employee{
	public Programmer(String empName, String role) {
		super(empName, role);

	}
	int calculateSalary(int salary)
	{
	
		 return super.calculateSalary(salary);
	}
}
	
	public static void main(String [] ar)
	{
		Employee e1=new Employee("King","Developer");
		System.out.println("Salary per Annum: "+e1.calculateSalary(5000));
		Employee e2=new Employee("Queen","Co-Dev");
		System.out.println("Salary per Annum: "+e2.calculateSalary(2000));
		
	}

}
