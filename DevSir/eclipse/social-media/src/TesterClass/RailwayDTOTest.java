package TesterClass;

import com.xworkz.DTO.railway.RailwayDTO;

public class RailwayDTOTest {
	public static void main(String[] args) {
		RailwayDTO rails = new RailwayDTO();
		rails.setTrainNo(123);
		
		RailwayDTO rails2 = new RailwayDTO();
		rails2.setTrainNo(203);
		
		System.out.println(rails.hashCode());
		System.out.println(rails2.hashCode());
		
		System.out.println(rails2.equals(rails));
	
	}

}
