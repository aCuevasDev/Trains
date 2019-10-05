package main.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Route class.
 * Contains a List with all the paths to it's destination
 * @author Alex
 *
 */
@Entity
@Table(name = "ROUTES")
public class Route extends PersistedEntity{
	
	@ManyToOne(targetEntity = Path.class)
	private List<Path> paths = new ArrayList<>(); // TODO Uso list porque considero que el orden tiene importancia, luego se harán checks para verificar su uniqueness

	/**
	 * @return the sum of the distance from all the {@link Path}
	 */
	@Transient
	public Integer getDistance() {
		return paths.stream().mapToInt(Path::getDistance).sum();
	}
	
	/**
	 * @return the final destination of this route
	 */
	@Transient
	public Town getDestination()
	{
		return paths.get(paths.size() -1).getDestination();
	}
	
	/**
	 * @return the origin of this route
	 */
	@Transient
	public Town getOrigin()
	{
		return paths.get(0).getOrigin();
	}
	
	/**
	 * @return the paths
	 */
	public List<Path> getPaths() {
		return paths;
	}

	/**
	 * @param paths the paths to set
	 */
	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}

}
