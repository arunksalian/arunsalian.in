package in.slin.app.http;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import in.slin.app.BaseTest;
import in.slin.app.http.exception.SlinHttpException;

public class SlinHttpServiceTest implements BaseTest {
	
	private SlinHttpService httpService;
	
	
	@Before
	public void init () {
		httpService = SlinHttpService.getInstance();
	}
	
	@Test
	public void verifySendGet () throws SlinHttpException {
		String response = httpService.sendGet(GEO_API);
		System.out.println(response);
		assertNotNull(response);
	}

}
