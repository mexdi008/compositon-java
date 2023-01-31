public class Computer {
	private Monitor monitor;
	private Motherboard motherboard;
	private Case Case;

	public Computer(Monitor monitor, Motherboard motherboard, Case Case) {
		this.setMonitor(monitor);
		this.setMotherboard(motherboard);
		this.setCase(Case);

	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public Case getCase() {
		return Case;
	}

	public void setCase(Case aCase) {
		Case = aCase;
	}
}
