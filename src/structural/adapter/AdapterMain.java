package structural.adapter;


public class AdapterMain {
	
	public AdapterMain(){
		EmployeeAInterface[] empA = new EmployeeAInterface[10];
		
		for (int i = 0; i < 5; i++) {
			empA[i] = new EmployeeA("Employee A - Name" + i);
		}
		
		for (int i = 5; i < 10; i++) {
			empA[i] = new EmployeeBAdapter("Employee B - Name" + i);
		}
		
		
		System.out.println("Company A:");
		CompanyA a = new CompanyA(empA);
		a.listEmployees();
		
		System.out.println();
		
		//////////////////////////////
		
		EmployeeB[] empB = new EmployeeB[5];
		
		for(int i = 0; i < 5; i++) {
			empB[i] = new EmployeeB("Employee B - Name" + i);
		}
		
		System.out.println("Company B");
		CompanyB b = new CompanyB(empB);
		b.printEmployees();
	}	

}
