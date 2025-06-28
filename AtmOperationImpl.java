package ATM_MACHINE;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
	ATM atm=new ATM();
	Map<Double,String> ministat=new HashMap<>();
	//@Override
	public void viewbalance() {
		System.out.println("Available balance is "+atm.getbalance());
		
	}
	
	//@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getbalance()) {
			ministat.put(withdrawAmount, "Amount withdraw");//map
			System.out.println(withdrawAmount+" is withdraw successfully!!!!!");
			atm.setbalance(atm.getbalance()-withdrawAmount);
			viewbalance();
		}
		else {
			System.out.println("Insufficient balance!!!!!!");
		}
		}
		else {
			System.out.println("Please enter the amount in multiple of 500");
		}
	}
	
	
	//@Override
    public void depositAmount(double depositAmount) {
    	ministat.put(depositAmount, "Amount depoisted");//map
    	System.out.println(depositAmount+" deposited successfully!!!!");
    	atm.setbalance(atm.getbalance()+depositAmount);
		viewbalance();
	}
    
  //@Override
    public void viewMiniStatement() {
    	for(Map.Entry<Double,String>m:ministat.entrySet()) {
    		System.out.println(m.getKey()+" "+m.getValue());
    	}
    	
    }
	 

}
