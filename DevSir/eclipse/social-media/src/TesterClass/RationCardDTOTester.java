package TesterClass;
import com.xworkz.DTO.rationcard.RationCardDTO.*;
public class RationCardDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				RationCardDTO r1 =  new RationCardDTO();
				System.out.println(r1);
				
				r1.setId(123456);
				r1.setTypeOfCard("BPL");
				r1.setNoOfMembers(4);
				r1.setMemberAddress("Maitri galli jamakhandi");
				r1.setRationShopAddress("Motiba galli jamakhandi");
				System.out.println(r1);
				
				System.out.println(r1.hashCode());
				
				System.out.println(r1.equals(r1));
	}

}
