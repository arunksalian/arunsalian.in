package in.slin.app.service;

import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.GeoCoordiate;

public interface SolarService {

	public GeoCoordiate getGeoCoordinate (Address address);
}