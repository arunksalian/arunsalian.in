package in.slin.app.service.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ResultComponent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("address_components")
	private AddressComponent [] addressComponents;
	@SerializedName("formatted_address")
	private String formattedAddress;
	
	private Geometry geometry;
	@SerializedName("place_id")
	private String placeId;
	private String[] types;
	
	public AddressComponent[] getAddressComponents() {
		return addressComponents;
	}
	public void setAddressComponents(AddressComponent[] addressComponents) {
		this.addressComponents = addressComponents;
	}
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	
}
