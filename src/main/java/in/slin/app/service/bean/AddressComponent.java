package in.slin.app.service.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class AddressComponent {

	@SerializedName("long_name")
	private String longName;
	@SerializedName("short_name")
	private String shortName;
	private String[] types;
	
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	
	public static void main (String[] arg) {
		Gson gson = new Gson();
		String json = "{\"long_name\": \"Vadakara\",\"short_name\": \"Vadakara\",\"types\": [\"locality\", \"political\"]}";
		AddressComponent addressComponent = gson.fromJson(json, AddressComponent.class);
		System.out.println("--");
	}
}
