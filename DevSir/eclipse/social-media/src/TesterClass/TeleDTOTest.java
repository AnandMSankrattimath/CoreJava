package TesterClass;

import com.xworkz.DTO.telecommunications.TeleDTO;

public class TeleDTOTest {
public static void main(String[] args) {
	TeleDTO t1 = new TeleDTO();
	t1.setDeviceId(123);
	System.out.println(t1.hashCode());
	
	System.out.println(t1.equals(t1));
	
	
	
	
	
}
	
	

}
