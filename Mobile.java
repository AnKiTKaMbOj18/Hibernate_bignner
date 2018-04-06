package kamboj.ankit.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int mid;
	private String mname;
	@ManyToOne
	private Person person;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mname=" + mname + "]";
	}

}
