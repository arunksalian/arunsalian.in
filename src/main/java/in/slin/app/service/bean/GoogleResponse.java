package in.slin.app.service.bean;

import java.io.Serializable;

public class GoogleResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResultComponent[] results;
	private String status;
	public ResultComponent[] getResults() {
		return results;
	}
	public void setResults(ResultComponent[] results) {
		this.results = results;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}