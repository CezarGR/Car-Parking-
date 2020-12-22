package parking;

public class Parking {
	private String name;
	private String model;
	private Integer license_plates;
	
	
	public Parking() {
	}
	
	public Parking(String name, String model, Integer license_plates) {
		this.name = name;
		this.model = model;
		this.license_plates = license_plates;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getLicense_plates() {
		return license_plates;
	}
	public void setLicense_plates(Integer license_plates) {
		this.license_plates = license_plates;
	}
	
	
}
