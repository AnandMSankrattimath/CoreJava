
package TesterClass;
import com.xworkz.DTO.metro.metroDTO.MetroDTO;

public class MetroDTOTester {
	public static void main(String[] args) {
		
		 MetroDTO metro = new MetroDTO();
		 System.out.println(metro);
		 
		 
		 metro.setTrainNo(113);
		 metro.setSourcePoint("Majestick");
		 metro.setDestinationPoint("Rajaji Nagar");
		 metro.setTimings("12:15 pm");
		 System.out.println(metro);
		 
		 MetroDTO metro1 = new MetroDTO();
		 System.out.println(metro1.hashCode());
		 
		 System.out.println(metro1.equals(metro));
		 
		 
		 
	
	}
	
}
 

