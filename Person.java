package kamboj.ankit.Hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;

	@OneToMany(mappedBy="person",fetch=FetchType.EAGER)
	private List<Mobile> mobile=new ArrayList<Mobile>();

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

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}

}
