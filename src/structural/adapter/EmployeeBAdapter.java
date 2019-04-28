package structural.adapter;

public class EmployeeBAdapter extends EmployeeB implements EmployeeAInterface{

	public EmployeeBAdapter(String fullName) {
		super(fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getFullName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.setFullName(name);
	}

}
