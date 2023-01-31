public class Motherboard {
	private String brandName;
	private String modelName;
	private String operatingSystem;
	private String numberOfSlots;

	public Motherboard(String brandName, String modelName, String operatingSystem, String numberOfSlots) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.numberOfSlots = numberOfSlots;
	}

	public void loadOperatingSystem() {
		System.out.println("Operating system loaded successfully: " + operatingSystem);
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String model) {
		this.modelName = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getNumberOfSlots() {
		return numberOfSlots;
	}

	public void setNumberOfSlots(String numberOfSlots) {
		this.numberOfSlots = numberOfSlots;
	}
}
