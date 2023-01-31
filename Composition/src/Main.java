public class Main {
	public static void main(String[] args) {
		Resolution resolution = new Resolution("1920", "1080");
		Monitor monitor = new Monitor("G2790PX/01", "AOC", resolution);
		Case Case = new Case("G120K", "AEGO", "Steel");
		Motherboard motherboard = new Motherboard("ASUS", "GX1221Ultra", "Windows 10", "6");
		Computer computer = new Computer(monitor, motherboard, Case);

		computer.getMonitor().closeMonitor();
		computer.getCase().openComputer();
		computer.getMotherboard().loadOperatingSystem();
		System.out.println(computer.getMotherboard().getBrandName());
	}
}