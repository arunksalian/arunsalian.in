package in.slin.app.service.bean;

import java.io.Serializable;

public class GeoCoordiate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cityName;
	private String longitude;
	private String latitude;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
