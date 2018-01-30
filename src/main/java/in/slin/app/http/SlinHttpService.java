package in.slin.app.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import in.slin.app.http.exception.SlinHttpException;

public class SlinHttpService {
	public static String HTTP_METHOD_GET = "GET";
	private final String USER_AGENT = "Mozilla/5.0";
	
	private SlinHttpService () {}
	
	public String sendGet (String url) throws SlinHttpException {
		URL obj;
		StringBuffer response = new StringBuffer();
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch ( IOException e) {
			throw new SlinHttpException();
		} 
		
		return response.toString();
	}
	
	public static SlinHttpService getInstance () {		
		return SHttpServicenHelper.INSTANCE;
	}
		
	private static class SHttpServicenHelper{
        private static final SlinHttpService INSTANCE = new SlinHttpService();
    }
}
