package sprinhibernate.sprinhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {

	@Id
	private int lid;
	private String lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int i) {
		this.lid = i;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
}
