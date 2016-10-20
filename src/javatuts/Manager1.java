package javatuts;
/**
 * @author iqbal
 * A sub-class constructor can invoke a super-class constructor 
 * using the super keyword. 
 * In line 30, show the parent class constructor invoking.
 */


class Employee1 {
	public String name;
	public float pay;
	
	public Employee1(String name, float pay){
		this.name = name;
		this.pay = pay;
	}
	
	public void showDetails(){
		System.out.println("Name: " + name +";"+ 
				" Salary: " + pay);
	}
}

public class Manager1 extends Employee1 {
	
	public String dept;
	
	public Manager1(String dept){
		super("Mahmud",50000F);
		this.dept = dept;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.print("Department: " + dept);
	}
 
	public static void main(String[] args){
		Manager1 newHire = new Manager1("Engineering");
		newHire.showDetails();
	}
}
