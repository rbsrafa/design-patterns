package behavioral.chainOfResponsibility;


public class Cash50Dispenser implements DispenseLink {

	private DispenseLink nextLink;
	
	@Override
	public void setNextLink(DispenseLink nextLink) {
		// TODO Auto-generated method stub
		this.nextLink = nextLink;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		
		if(cur.getAmount() >= 50) {
			
			int notes = cur.getAmount() / 50;
			System.out.println("Dispensing " + notes + " notes of 50 Euro");
			
			int remainder = cur.getAmount()%50;
			
			if(remainder != 0) {
				nextLink.dispense(new Currency(remainder));
			}
			
		}
		else {
			
			nextLink.dispense(cur);
			
		}
		
	}
    	

    
}