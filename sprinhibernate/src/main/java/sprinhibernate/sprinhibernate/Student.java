package sprinhibernate.sprinhibernate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	private int rollNo;
	private String sName;
	private int marks;
	@OneToOne(fetch=FetchType.LAZY)
	private laptop laptop;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", marks=" + marks + ", laptop=" + laptop + "]";
	}
	
	
}
