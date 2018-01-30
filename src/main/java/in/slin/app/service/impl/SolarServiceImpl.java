package in.slin.app.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import in.slin.app.http.SlinHttpService;
import in.slin.app.http.exception.SlinHttpException;
import in.slin.app.service.SolarService;
import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.Coordinate;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.bean.GoogleResponse;
import in.slin.app.service.exception.ServiceException;
import in.slin.app.service.util.ServiceUtil;

public class SolarServiceImpl implements SolarService {

	private ServiceUtil serviceUtil;
	private static final Logger LOGGER = LoggerFactory.getLogger(SolarServiceImpl.class);
	
	@Autowired
	public SolarServiceImpl(ServiceUtil serviceUtil) {
		this.serviceUtil = serviceUtil;
	}
	
	private String getFormattedAPI (String url, String param) {
		return String.format(url, param);
	}
	
	private GoogleResponse getResponse (String json) {
		Gson gson = new Gson();
		GoogleResponse googleResponse = gson.fromJson(json, GoogleResponse.class);
		return googleResponse;
	}
	
	
	
	public GeoCoordiate getGeoCoordinate(Address address) throws ServiceException {
		String coordinateAPI = serviceUtil.getCoordinateAPI(); 
		String url = getFormattedAPI(coordinateAPI, address.toString());
		LOGGER.info("url:{}", url);
		try {
			String response = SlinHttpService.getInstance().sendGet(url);
			LOGGER.info("google coordinates:\n {}", response);
			GoogleResponse googleResponse = getResponse(response);
			Coordinate coordinate = googleResponse.getResults()[0].getGeometry().getLocation();
			String addressLong = googleResponse.getResults()[0].getFormattedAddress();
			GeoCoordiate geoCoordiate = new GeoCoordiate(coordinate, addressLong);
			LOGGER.info("geoCoordiate:{}", geoCoordiate);
			return geoCoordiate;
		} catch (SlinHttpException e) {
			throw new ServiceException("Failed to get Geo coordinates", e);
		}
	} 
	
	

}
