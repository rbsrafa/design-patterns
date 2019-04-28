package structural.adapter;


public class CompanyA {

	EmployeeAInterface[] emp = null;
	
	public CompanyA(EmployeeAInterface[] emp) {
		this.emp = emp;
	}
	
	public void listEmployees() {
		for (EmployeeAInterface employee : emp) {
			System.out.println(employee.getName());
		}
	}

}
