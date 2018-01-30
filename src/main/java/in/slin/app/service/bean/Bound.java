package in.slin.app.service.bean;

import java.io.Serializable;

public class Bound implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Coordinate northeast;
	private Coordinate southwest;
	public Coordinate getNortheast() {
		return northeast;
	}
	public void setNortheast(Coordinate northeast) {
		this.northeast = northeast;
	}
	public Coordinate getSouthwest() {
		return southwest;
	}
	public void setSouthwest(Coordinate southwest) {
		this.southwest = southwest;
	}
	
	
}
