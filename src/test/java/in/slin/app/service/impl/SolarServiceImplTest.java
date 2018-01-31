package in.slin.app.service.impl;



import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.Date;

import static org.junit.Assert.*;

import in.slin.app.BaseTest;
import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.Coordinate;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.exception.ServiceException;
import in.slin.app.service.util.ServiceUtil;

public class SolarServiceImplTest implements BaseTest {
	
	private SolarServiceImpl service;
	private Address address;
	private Coordinate coordinate;
	
	@Before
	public void inti() {
		address = new Address("Vatakara", "Kerala", "India");
		coordinate = new Coordinate("75.5917092", "11.608495");
		ServiceUtil serviceUtil = mock(ServiceUtil.class);
		when(serviceUtil.getCoordinateAPI()).thenReturn(GEO_API);
		when(serviceUtil.getSolarRiseAPI()).thenReturn(SOLAR_API);
		service = new SolarServiceImpl(serviceUtil);
	}

	@Test
	public void verifySolarServiceImpl () {
		assertNotNull(service);
	}
	
	@Test
	public void verifyGetGeoCoordinate () throws ServiceException {
		GeoCoordiate geoCoordiate = service.getGeoCoordinate(address);
		assertNotNull(geoCoordiate);
		assertNotNull(geoCoordiate.getLatitude());
	}
	@Test
	public void verifyTimeOfRise () throws ServiceException {
		Date date = new Date (System.currentTimeMillis()); 
		String time = service.getTimeOfRise(coordinate, date);
		assertNotNull(time);
	}
}

