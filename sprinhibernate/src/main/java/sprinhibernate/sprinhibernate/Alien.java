package sprinhibernate.sprinhibernate;

import javax.persistence.*;
import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy; 
@Entity
@Table(name = "alien")
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)  
public class Alien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private String aName;
	private String aColor;
	@Transient
	private String aPlace;
	public String getaPlace() {
		return aPlace;
	}
	public void setaPlace(String aPlace) {
		this.aPlace = aPlace;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaColor() {
		return aColor;
	}
	public void setaColor(String aColor) {
		this.aColor = aColor;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", aColor=" + aColor + "]";
	}
	 
}
