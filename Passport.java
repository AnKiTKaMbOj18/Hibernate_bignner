package kamboj.ankit.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Passport {
	@Id
	private int pid;
	private String pname;

	@OneToOne
	private Person1 person;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	

	public Person1 getPerson() {
		return person;
	}

	public void setPerson(Person1 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pname=" + pname + "]";
	}

}
