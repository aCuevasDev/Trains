package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Paths")
public class Path extends PersistedEntity{
	
	private Town origin;
	private Town destination;
	private Integer distance;
	
	public Path()
	{
		
	}
	
	public Path(Town origin, Town destination, Integer distance)
	{
		setOrigin(origin);
		setDestination(destination);
		setDistance(distance);
	}
	
	/**
	 * @return the destination
	 */
	public Town getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Town destination) {
		this.destination = destination;
	}
	/**
	 * @return the origin
	 */
	public Town getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Town origin) {
		this.origin = origin;
	}

	/**
	 * @return the distance
	 */
	public Integer getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	} 

}
