package TesterClass;
import com.xworkz.DTO.hospital.hospitalDTO.*;
public class HospitalDTOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				HospitalDTO h1 = new HospitalDTO();
				System.out.println(h1);
				
				h1.setNoOfPatient(12);
				h1.setNoOfDoctors(12);
				h1.setNoOfCounters(1);
				h1.setCharges(200);
				System.out.println(h1);
				
				System.out.println(h1.hashCode());
				
				System.out.println(h1.equals(h1));
		

	}

}
