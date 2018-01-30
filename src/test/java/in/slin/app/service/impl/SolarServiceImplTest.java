package in.slin.app.service.impl;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import in.slin.app.service.util.ServiceUtil;

public class SolarServiceImplTest {
	
	private SolarServiceImpl service;
	
	@Before
	public void inti() {
		ServiceUtil serviceUtil = mock(ServiceUtil.class);
		service = new SolarServiceImpl(serviceUtil);
	}

	@Test
	public void verifySolarServiceImpl () {
		Assert.assertNotNull(service);
	}
}

