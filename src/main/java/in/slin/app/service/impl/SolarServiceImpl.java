package in.slin.app.service.impl;

import in.slin.app.service.SolarService;
import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.util.ServiceUtil;

public class SolarServiceImpl implements SolarService {

	private ServiceUtil serviceUtil;
	
	public SolarServiceImpl(ServiceUtil serviceUtil) {
		this.serviceUtil = serviceUtil;
	}
	
	private String getFormattedAPI (String url, String param) {
		return String.format(url, param);
	}
	
	
	@Override
	public GeoCoordiate getGeoCoordinate(Address address) {
		String coordinateAPI = serviceUtil.getCoordinateAPI();
		String url = getFormattedAPI(coordinateAPI, address.toString());
		String.format(coordinateAPI, address);
		//coordinateAPI.
		return null;
	}

}
