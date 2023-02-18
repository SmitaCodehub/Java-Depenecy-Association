package in.iNeuron.bean;

public class Employee {
	
	private String eid;
	private String ename;
	private String eaddr;
	
	
	// HAS-A relationship
	Account account;
	
	//Constuctor Injection 
	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	
	 
	public void getEployeeDetails()
	{
		System.out.println("Employee Details are :: ");
		System.out.println("Employee ID :" +eid);
		System.out.println("Employee name :" +ename);
		System.out.println("Employee ID :" +eaddr);
		System.out.println("===Employee Accout details===");
		System.out.println("Account  Nuber:: "+account.accNo);
		System.out.println("Account NAme:: "+account.accName);
		System.out.println("Account  Type:: "+account.accType);
		
	}

	
	
	


	
	}


