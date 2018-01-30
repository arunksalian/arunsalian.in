package in.slin.app.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import in.slin.app.http.exception.SlinHttpException;

public class HttpService {
	public static String HTTP_METHOD_GET = "GET";
	
	private HttpService () {}
	
	public String sendGet (String url) throws SlinHttpException {
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
		} catch ( IOException e) {
			throw new SlinHttpException();
		} 
		
		return null;
	}
	
	public static HttpService getInstance () {		
		return SHttpServicenHelper.INSTANCE;
	}
		
	private static class SHttpServicenHelper{
        private static final HttpService INSTANCE = new HttpService();
    }
}
