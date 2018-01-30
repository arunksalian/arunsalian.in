package in.slin.app.service.impl;



import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import in.slin.app.BaseTest;
import in.slin.app.service.bean.Address;
import in.slin.app.service.bean.GeoCoordiate;
import in.slin.app.service.exception.ServiceException;
import in.slin.app.service.util.ServiceUtil;

public class SolarServiceImplTest implements BaseTest {
	
	private SolarServiceImpl service;
	private Address address;
	
	@Before
	public void inti() {
		address = new Address("Vatakara", "Kerala", "India");
		ServiceUtil serviceUtil = mock(ServiceUtil.class);
		when(serviceUtil.getCoordinateAPI()).thenReturn(GEO_API);
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
}

