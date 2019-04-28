package structural.adapter;


public class EmployeeA implements EmployeeAInterface{

	private String name;

	public EmployeeA(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
}
