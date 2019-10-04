package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Towns")
public class Town extends PersistedEntity{
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
