package com.xworkz.DTO.socialmedia.socialmediaDTO;

public class SocialMediaDTO { // Encapsulation rule no 1) class has public access specifier.
	private String appName;        //  2) class property has private access specifier.
	private int socialMediaID;
	private String founder;
	private String size;
	private String version;
	
	public SocialMediaDTO() { // 3) atleast one default constructor.
		//
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

	public String getAppName() {     // 4) use getters and setters method for initializing the values to the properties. 
		return appName;                    // 5) class does not have the final 
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getSocialMediaID() {
		return socialMediaID;
	}

	public void setSocialMediaID(int socialMediaID) {
		this.socialMediaID = socialMediaID;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "SocialMediaDTO - [ID = "+this.socialMediaID+",Social Media App Name = "+this.appName+",Founder Name = "+this.founder+",Size = "+this.size+", Version = "+this.version+"]";
	}

	@Override
	public int hashCode() {
		return socialMediaID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SocialMediaDTO other = (SocialMediaDTO) obj;
		if (socialMediaID != other.socialMediaID)
			return false;
		return true;
	}
	
	

}
