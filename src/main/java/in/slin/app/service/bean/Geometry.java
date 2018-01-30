package in.slin.app.service.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Geometry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Bound bounds;
	private Coordinate location;
	@SerializedName("location_type")
	private String locationType;
	private Bound viewport;
	public Bound getBounds() {
		return bounds;
	}
	public void setBounds(Bound bounds) {
		this.bounds = bounds;
	}
	public Coordinate getLocation() {
		return location;
	}
	public void setLocation(Coordinate location) {
		this.location = location;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public Bound getViewport() {
		return viewport;
	}
	public void setViewport(Bound viewport) {
		this.viewport = viewport;
	}
	
}
