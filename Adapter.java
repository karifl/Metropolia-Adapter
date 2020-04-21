package adapter;

public class Adapter implements OtherOSintoLinux{

	private WindowsEnvironment os1 = new WindowsEnvironment();
	private MacEnvironment os2 = new MacEnvironment();
	private UbuntuEnvironment os3 = new UbuntuEnvironment();
	
	public Adapter() {
	}

	@Override
	public void request(String executive) {
		// TODO Auto-generated method stub
		if (executive.contains(".exe")){
			System.out.println("Starting Windows OS");
			os1.execute();
		}else if(executive.contains(".app")) {
			System.out.println("Starting Mac OS");
			os2.execute();
		}else if(executive.contains(".sh")) {
			System.out.println("Starting Linux OS");
			os3.execute();
		}else {
			System.out.println("Error, no such executable file exist.");
		}
		
	}
}
