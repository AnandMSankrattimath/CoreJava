package TesterClass;
import com.xworkz.DTO.voter.voterDTO.*;
public class VoterDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VoterDTO v1 = new VoterDTO();
		 System.out.println(v1);
		 
		 v1.setName("Anand");
		 v1.setVoterID(123);
		 v1.setDob("01/01/2001");
		 v1.setAddress("Bagalkot dist, Jamakhandi tq");
		 System.out.println(v1);
		 
		 System.out.println(v1.hashCode());
		 System.out.println(v1.equals(v1));
	}

}
