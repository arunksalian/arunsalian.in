package in.slin.app.service.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="serviceUrl")
public class ServiceUtil {

	private String solarRiseAPI;
	private String coordinateAPI;
	
	public String getSolarRiseAPI() {
		return solarRiseAPI;
	}
	public void setSolarRiseAPI(String solarRiseAPI) {
		this.solarRiseAPI = solarRiseAPI;
	}
	public String getCoordinateAPI() {
		return coordinateAPI;
	}
	public void setCoordinateAPI(String coordinateAPI) {
		this.coordinateAPI = coordinateAPI;
	}
	
	
	
}
