package TesterClass;

import com.xworkz.DTO.brtc.brtcDTO.BrtcDTO;

public class BrtcDTOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//BrtcDTO br1 = new BrtcDTO();
			//System.out.println(br1);
			
			        BrtcDTO br2 = new BrtcDTO();
			        br2.setBusNo(10);
			        br2.setRoute("Rajakumar Road");
			        br2.setSourcePoint("Bashyam Circle");
			        br2.setDestinationPoint("Majestick");
			      //  System.out.println(br2.toString());
			        
			     BrtcDTO br3 = new BrtcDTO();
			     	br3.setBusNo(11);
			     	br3.setRoute("HebbalFlyOver");
			     	br3.setSourcePoint("Yalahanka");
			     	br3.setDestinationPoint("Majestick");
			     	//System.out.println(br3.toString());
			     	
			     	System.out.println(br2.hashCode());
			     	//System.out.println(br3.hashCode());  // which calls the default method present in the object class.It returns memory address of the object.
			     										//Developer don't want this default method so, He can override it, by changing some logic.
			     	
			     	System.out.println(br2.equals(br3));// comparing two object shallow compare.....
			     	
			     	
			     	
	}

}
