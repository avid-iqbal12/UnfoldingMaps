package javatuts;
/**
 * 
 * @author iqbal
 * A sub-class method can invoke a super-class method using the super 
 * keyword. The following code invokes the parent class method showDetails().
 */
class Employee {
	public String name = "Ackmed";
	public float pay = 40000;
	
	public void showDetails(){
		System.out.println(name);
		System.out.println(pay);
	}
}

public class Manager extends Employee {
	
	public String dept = "Engineering";
	
	public void showDetails(){
		super.showDetails();
		System.out.print(dept);
	}
 
	public static void main(String[] args){
		Manager newHire = new Manager();
		newHire.showDetails();
	}
}
