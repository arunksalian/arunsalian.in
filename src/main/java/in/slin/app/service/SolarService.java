package in.slin.app.service;

import java.util.Date;

import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.Coordinate;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.exception.ServiceException;

public interface SolarService {

	public GeoCoordiate getGeoCoordinate (Address address) throws ServiceException;
	public String getTimeOfRise (Coordinate coordinate, Date date) throws ServiceException;
}
