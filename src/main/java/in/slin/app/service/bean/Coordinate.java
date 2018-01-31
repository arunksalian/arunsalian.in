package in.slin.app.service.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Coordinate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SerializedName("lng")
	private String longitude;
	@SerializedName("lat")
	private String latitude;
	
	public Coordinate () {}
	
	public Coordinate (String lng, String lat) {
		this.longitude = lng;
		this.latitude = lat;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	

}
