package TesterClass;
import com.xworkz.DTO.socialmedia.socialmediaDTO.SocialMediaDTO;
public class SocialmediaDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SocialMediaDTO sc =  new SocialMediaDTO(); // creating the objects & calling the default constructor. 
		System.out.println(sc); // printing the object.
		
		SocialMediaDTO sc1 = new SocialMediaDTO();
		sc1.setAppName("FacseBook");
		sc1.setFounder("Mark Z");
		sc1.setSocialMediaID(1);
		sc1.setSize("120MB");
		sc1.setVersion("version 2.5");
		System.out.println(sc1);
		
		System.out.println(sc1.hashCode());
		System.out.println(sc.hashCode());
		
		System.out.println(sc.equals(sc1));
		

	}

}
 