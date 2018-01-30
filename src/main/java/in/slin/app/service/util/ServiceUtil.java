package in.slin.app.service.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="serviceUrl")
public class ServiceUtil {

	private String solarRise;

	public String getSolarRise() {
		return solarRise;
	}

	public void setSolarRise(String solarRise) {
		this.solarRise = solarRise;
	}
}
