package structural.adapter;


public class EmployeeB implements EmployeeBInterface{
	
	private String fullName;

	public EmployeeB(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String getFullName() {
		return fullName;
	}

	@Override
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
