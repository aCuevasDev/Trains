package main.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TOWNS")
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Town [name=" + name + "]";
	}

}
