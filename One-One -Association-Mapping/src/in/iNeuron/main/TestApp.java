package in.iNeuron.main;
import in.iNeuron.bean.Account;
import in.iNeuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		Account acc = new Account("BOM123","Ram", "Saving");
		Employee emp=new Employee("R1","Ram","Pune",acc);
		emp.getEployeeDetails();
		
	}

}
