package kamboj.ankit.HibDemo;

import javax.persistence.Entity;

@Entity
public class TwoWheller extends Vehicle1{
	
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	

}
