package adapter;

import java.util.Scanner;

public class LinuxClient {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myChoice = new Scanner(System.in);
		Adapter emu = new Adapter();
	System.out.println();
	System.out.println("Which one of the executive files you want to start \n.sh, .exe or .app \n");
	String command="";
	System.out.println();
	command = myChoice.nextLine();
	emu.request(command);

}
}