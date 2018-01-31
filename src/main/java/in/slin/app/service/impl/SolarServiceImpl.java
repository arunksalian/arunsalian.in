package in.slin.app.service.impl;

import java.time.LocalDate;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import in.slin.app.SlinUtils;
import in.slin.app.http.SlinHttpService;
import in.slin.app.http.exception.SlinHttpException;
import in.slin.app.service.SolarService;
import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.Coordinate;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.bean.GoogleResponse;
import in.slin.app.service.bean.SolarResponse;
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
	
	private String getFormattedAPI (String url, String param1, String param2, String param3) {
		return String.format(url, param1, param2, param3);
	}
	
	private GoogleResponse getResponse (String json) {
		Gson gson = new Gson();
		GoogleResponse googleResponse = gson.fromJson(json, GoogleResponse.class);
		return googleResponse;
	}
	
	private Object getResponse (String json, Class clazz) {
		Gson gson = new Gson();
		Object object = gson.fromJson(json, clazz);
		return object;
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
	
	public String getTimeOfRise (Coordinate coordinate, Date date) throws ServiceException {
		String solarAPI = serviceUtil.getSolarRiseAPI();
		String url = getFormattedAPI(solarAPI, coordinate.getLatitude(), coordinate.getLongitude(), SlinUtils.getDateString(date));
		try {
			String response = SlinHttpService.getInstance().sendGet(url);
			LOGGER.info("Solar response:\n {}", response);
			SolarResponse solarResponse = (SolarResponse) getResponse(response, SolarResponse.class);
			return solarResponse.getResults().getSunrise();
		} catch (SlinHttpException e) {
			throw new ServiceException("Failed to get Solar Response", e);
		}
		
	}
}
