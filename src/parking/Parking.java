package parking;

public class Parking {
	private String name;
	private String model;
	private String license_plates;
	private Integer hora;
	private Integer minuts;
	
	public Parking() {
	}
	
	public Parking(String name, String model, String license_plates) {
		this.name = name;
		this.model = model;
		this.license_plates = license_plates;
	}
		
	public Parking(String name, String model, String license_plates, Integer hora, Integer minuts) {
		this.name = name;
		this.model = model;
		this.license_plates = license_plates;
		this.hora = hora;
		this.minuts = minuts;
	}

	public double calc(int hora, int minuts) {
		int h1;
		int m1;
		
		h1 = hora-this.hora;
		m1 = minuts-this.minuts;
		
		if(h1>4) {
			return 40.00;
		}
		if(h1>=3) {
			return 30.00;
		}
		if(h1>=2) {
			return 20.00;
		}
		else {
			return 10.00;
		}
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

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinuts() {
		return minuts;
	}

	public void setMinuts(Integer minuts) {
		this.minuts = minuts;
	}
	
	
	
	
	
	
}
