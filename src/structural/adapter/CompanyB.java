package structural.adapter;


public class CompanyB {

	EmployeeBInterface[] emp = null;
	
	public CompanyB(EmployeeBInterface[] emp) {
		this.emp = emp;
	}
	
	public void printEmployees() {
		for (EmployeeBInterface employee : emp) {
			System.out.println(employee.getFullName());
		}
	}
	
}
