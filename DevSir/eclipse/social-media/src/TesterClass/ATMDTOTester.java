package TesterClass;
import com.xworkz.DTO.atm.atmDTO.ATMDTO;

public class ATMDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ATMDTO atm = new ATMDTO();
		 System.out.println(atm);
		 
		 atm.setTypeOfCard("DEBIT");
		 atm.setDeposite(5000);
		 atm.setWitdrawal(5000);
		 System.out.println("deposite "+atm.getDeposite());
		 System.out.println("witdrawl "+atm.getWitdrawal());
		 
		 System.out.println(atm.hashCode());
		 
		 System.out.println((atm.equals(atm)));
	}

}
