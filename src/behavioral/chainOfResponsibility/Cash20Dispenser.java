package behavioral.chainOfResponsibility;


public class Cash20Dispenser implements DispenseLink {
	
    private DispenseLink nextLink;
	
	@Override
	public void setNextLink(DispenseLink nextLink) {
		this.nextLink = nextLink;
	}

	@Override
	public void dispense(Currency cur) {
		
		if(cur.getAmount() >= 20){
		
			int num = cur.getAmount()/20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20 Euro note");
			
			if(remainder !=0) {
				this.nextLink.dispense(new Currency(remainder));
			}
			
		}else{
			this.nextLink.dispense(cur);
		}
	}
    
}
