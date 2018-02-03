package in.slin.app.core.data;

import java.io.Serializable;

import in.slin.app.service.bean.Coordinate;

public class LegnaProps implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CountryEnum countryEnum;
	private Coordinate birthCoordinate;
	
	public CountryEnum getCountryEnum() {
		return countryEnum;
	}
	public void setCountryEnum(CountryEnum countryEnum) {
		this.countryEnum = countryEnum;
	}
	public Coordinate getBirthCoordinate() {
		return birthCoordinate;
	}
	public void setBirthCoordinate(Coordinate birthCoordinate) {
		this.birthCoordinate = birthCoordinate;
	}
	
	

}
