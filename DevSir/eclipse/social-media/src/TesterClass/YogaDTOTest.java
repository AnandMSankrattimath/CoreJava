package TesterClass;

import com.xworkz.DTO.yoga.yogaDTO.YogaDTO;

public class YogaDTOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			YogaDTO yoga1 = new YogaDTO();
			yoga1.setYogaCenterNo(10);
			
			System.out.println(yoga1.hashCode());
			
			YogaDTO yoga2 = new YogaDTO();
			yoga2.setYogaCenterNo(12);
			System.out.println(yoga2.hashCode());
			
			System.out.println(yoga1.equals(yoga2));
	}

}
