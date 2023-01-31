public class Case {
	private String modelName;
	private String brandName;
	private String material;

	public Case(String modelName, String brandName, String material) {
		this.setModelName(modelName);
		this.setBrandName(brandName);
		this.setMaterial(material);
	}

	public void openComputer() {
		System.out.println("Computer is opening");
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
