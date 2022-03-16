
import com.xworkz.aboutHashCode.AdharInfo;

public class AdharInfoTestHashCode {

	public static void main(String[] args) {
		     AdharInfo a1 = new AdharInfo();
		     System.out.println(a1);  // if we aren't initialize the value then the default value is 0(zero).
		     a1.setAdharId(11);
		     a1.setName("Anand");
		     a1.setAddress("Jamakhandi");
		     System.out.println(a1.hashCode());
		     
		     AdharInfo a2 = new AdharInfo();
		     a1.setAdharId(11);
		     a1.setName("Anand");
		     a1.setAddress("Jamakhandi");
		     System.out.println(a2.hashCode());

		     
		     System.out.println(a1.equals(a2)); // comparing memory allocation of the object
		     
		     
	}
}
