package TesterClass;
import com.xworkz.DTO.adhar.adharDTO.AdharDTO;

public class AdharDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					AdharDTO a1 = new AdharDTO();
					System.out.println(a1);
					a1.setId(123);
					a1.setName("Anand");
					a1.setDob("01/01/2001");
					a1.setAddress("bagalkot dist , jamakhandi tq");
					System.out.println(a1.getId());
					System.out.println("hashcode valaue"+a1.hashCode());
					AdharDTO a2 = new AdharDTO();
					a2.setId(12);
					System.out.println(a2.getId());
					
					
					System.out.println(a1.equals(a2));

	}

}
