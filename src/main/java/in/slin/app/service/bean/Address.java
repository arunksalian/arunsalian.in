package in.slin.app.service.bean;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cityName;
	private String stateName;
	private String countryName;
	
	public Address () {}
	
	public Address (String cityName, String stateName, String countryName) {
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

	public String toString () {
		StringBuffer buffer = new StringBuffer(cityName);
		if (stateName != null) {
			buffer.append(",").append(stateName);
		}
		buffer.append(",").append(countryName);
		return buffer.toString();
	}
}
