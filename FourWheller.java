package kamboj.ankit.HibDemo;

import javax.persistence.Entity;

@Entity
public class FourWheller extends Vehicle1 {
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
