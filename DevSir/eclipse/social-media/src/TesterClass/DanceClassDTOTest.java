package TesterClass;
import com.xworkz.DTO.danceclass.danceclassDTO.DanceClassDTO;

public class DanceClassDTOTest {
	public static void main(String[] args) {
		DanceClassDTO dance = new DanceClassDTO();
		dance.setSchoolNo(12);
		dance.setSchoolname("puneeth dances chool ");
		dance.setStrength(11);
		System.out.println(dance);
		System.out.println(dance.hashCode());
		
		DanceClassDTO dance2 = new DanceClassDTO();
		System.out.println(dance2.hashCode());
		
		System.out.println(dance.equals(dance2));
		
		
		
	}

}
