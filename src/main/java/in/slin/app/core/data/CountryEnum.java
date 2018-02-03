package in.slin.app.core.data;

import java.util.TimeZone;

public enum CountryEnum {

	INDIA ("india", TimeZone.getTimeZone("ist"), "82.5", "21.7679");
	private String name;
	private TimeZone timeZone;
	private String logitude;
	private String latitude;
	
	private CountryEnum (String name, TimeZone timeZone, String logitude, String latitude) {
		this.name = name;
		this.timeZone = timeZone;
		this.logitude = logitude;
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public String getLogitude() {
		return logitude;
	}

	public String getLatitude() {
		return latitude;
	}
	
	
}
