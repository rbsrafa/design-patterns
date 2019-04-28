package behavioral.chainOfResponsibility;


public class Cash10Dispenser implements DispenseLink {

	private DispenseLink nextChain;
	
	@Override
	public void setNextLink(DispenseLink nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		
		if(cur.getAmount() >= 10){
		
			int num = cur.getAmount()/10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10 Euro note");
			
			if(remainder !=0) {
				this.nextChain.dispense(new Currency(remainder));
			}
			
		}else{
			this.nextChain.dispense(cur);
		}
	}
    
}
