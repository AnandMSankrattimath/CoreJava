package TesterClass;
import com.xworkz.DTO.courtcase.courtcaseDTO.CourtCaseDTO;
public class CourtCaseDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CourtCaseDTO case1 = new CourtCaseDTO();
		System.out.println(case1);
		
		case1.setCaseNO(123);
		case1.setOpponent("Anand");
		case1.setPetitioner("sankrattimath");
		System.out.println(case1);
		
		CourtCaseDTO case2 = new CourtCaseDTO();
		case2.setCaseNO(123);
		
		System.out.println(case1.hashCode());
		
		System.out.println(case1.equals(case2));

	}

}
