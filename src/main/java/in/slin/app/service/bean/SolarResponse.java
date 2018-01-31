package in.slin.app.service.bean;

import java.io.Serializable;

public class SolarResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private SolarResult results;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public SolarResult getResults() {
		return results;
	}
	public void setResults(SolarResult results) {
		this.results = results;
	}
	
	

}
