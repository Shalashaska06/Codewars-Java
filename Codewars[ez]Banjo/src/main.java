import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		
	
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Howdy mate ! what's your name ?");
	String name = scan.nextLine();
	
	
	areYouPlayingBanjo(name);
	

	}
	
	
	static char areYouPlayingBanjo(String name) {
		
		char index = name.charAt(0);
		
	
		if(index == ('r') || index == ('R')) {
			
		System.out.println(name + " plays banjo" );
		}
		
		else {
			System.out.println(name + " does not play banjo");
		}
		return index;
	}
	
	

}
