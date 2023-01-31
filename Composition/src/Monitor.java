public class Monitor {
	private String modelName;
	private String brandName;
	private Resolution resolution;

	public Monitor(String modelName, String brandName, Resolution resolution) {
		this.setModelName(modelName);
		this.setBrandName(brandName);
		this.setResolution(resolution);
	}

	public void closeMonitor() {
		System.out.println("Monitor is going to sleep mode");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
}
