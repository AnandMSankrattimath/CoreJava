package com.xworkz.DTO.telecommunications;

public class TeleDTO {
	private int deviceId;
	private int noOfDevices;
	private String typeOfDeiveString;
	public TeleDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getNoOfDevices() {
		return noOfDevices;
	}
	public void setNoOfDevices(int noOfDevices) {
		this.noOfDevices = noOfDevices;
	}
	public String getTypeOfDeiveString() {
		return typeOfDeiveString;
	}
	public void setTypeOfDeiveString(String typeOfDeiveString) {
		this.typeOfDeiveString = typeOfDeiveString;
	}
	@Override
	public String toString() {
		return "TeleDTO [deviceId=" + deviceId + ", noOfDevices=" + noOfDevices + ", typeOfDeiveString="
				+ typeOfDeiveString + "]";
	}

	@Override
	public int hashCode() {
		return deviceId;
	}

	@Override
	public boolean equals(Object obj) {
		
		TeleDTO tele1 = (TeleDTO) obj;
		if (deviceId == tele1.deviceId)
			return true;
		return false;
	}
	
	

}
