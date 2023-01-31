public class Resolution {
	private String width;
	private String height;

	public Resolution(String width, String height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
}
