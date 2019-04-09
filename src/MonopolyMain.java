import java.util.*;

class Player {
	String name;
	int money = 1000;
	Vector<String> properties;
	int position = 0;
	char symbol = ' ';
}

class Property {
	String name;
	int cost;
	String owner = "(no owner)";
	char posSymbolA = ' ';
	char posSymbolB = ' ';
}

public class MonopolyMain {

	public static Vector<Property> initializeProperties() {
		Vector<Property> allProperties = new Vector<Property>();
		Property Start = new Property();
		Start.name = "Start";
		allProperties.add(Start);
		
		Property Autopia = new Property();
		Autopia.name = "Autopia";
		Autopia.cost = 100;
		allProperties.add(Autopia);
		
		Property Incredicoaster = new Property();
		Incredicoaster.name = "Incredicoaster";
		Incredicoaster.cost = 200;
		allProperties.add(Incredicoaster);
		
		Property DowntownDisney = new Property();
		DowntownDisney.name = "DowntownDisney";
		allProperties.add(DowntownDisney);
		
		Property JungleCruise = new Property();
		JungleCruise.name = "JungleCruise";
		JungleCruise.cost = 300;
		allProperties.add(JungleCruise);
		
		Property Monorail = new Property();
		Monorail.name = "Monorail";
		Monorail.cost = 400;
		allProperties.add(Monorail);
		
		Property GetAutographs = new Property();
		GetAutographs.name = "GetAutographs";
		allProperties.add(GetAutographs);
		
		Property SplashMountain = new Property();
		SplashMountain.name = "SplashMountain";
		SplashMountain.cost = 500;
		allProperties.add(SplashMountain);
		
		Property RadiatorSpringsRacers = new Property();
		RadiatorSpringsRacers.name = "RadiatorSpringRacer";
		RadiatorSpringsRacers.cost = 600;
		allProperties.add(RadiatorSpringsRacers);
		
		Property GoToDowntownDisney = new Property();
		GoToDowntownDisney.name = "GoToDowntownDisney";
		allProperties.add(GoToDowntownDisney);

		Property MadTeaParty = new Property();
		MadTeaParty.name = "MadTeaParty";
		MadTeaParty.cost = 700;
		allProperties.add(MadTeaParty);
		
		Property ItsASmallWorld = new Property();
		ItsASmallWorld.name = "ItsASmallWorld";
		ItsASmallWorld.cost = 800;
		allProperties.add(ItsASmallWorld);

		return allProperties;
	}

	public static void initializeGame(Player player1, Player player2, Vector<Property> allProperties) {
		player1.symbol = '@';
		player2.symbol = '%';
		
		System.out.println("Enter player 1 name ( " + "" + player1.symbol + "" + " )");
		Scanner in = new Scanner(System.in);
		String player1name = in.nextLine();
		System.out.println("Enter player 2 name ( " + "" + player2.symbol + "" + " )");
		String player2name = in.nextLine();
		player1.name = player1name;
		player2.name = player2name;

		allProperties.get(0).posSymbolA = player1.symbol;
		allProperties.get(0).posSymbolB = player2.symbol;
	}
	
	public static void displayBoard(Vector<Property> allProperties, Player player1, Player player2) {
		
		// top border
		for (int i = 0; i < 81; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		/*Row 1*/
		System.out.print("|");
		for (int i = 0; i < 19; i++) {
			System.out.print(" ");
		}
		
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(1).name);
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(2).name);
		System.out.print("|");
		for (int i = 0; i < 19; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
		
		System.out.print("|");

		System.out.printf("%19s", "START");

		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(1).cost);
		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(2).cost);
		System.out.print("|");
		System.out.printf("%19s", "DowntownDisney");

		System.out.println("|");
		
		
		System.out.print("|");
		System.out.print(allProperties.get(0).posSymbolA + "" + allProperties.get(0).posSymbolB);
		for (int i = 0; i < 17; i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.print(allProperties.get(1).posSymbolA + "" + allProperties.get(1).posSymbolB);
		System.out.printf("%17s", allProperties.get(1).owner);
		System.out.print("|");
		System.out.print(allProperties.get(2).posSymbolA + "" + allProperties.get(2).posSymbolB);
		System.out.printf("%17s", allProperties.get(2).owner);
		System.out.print("|");
		
		System.out.print(allProperties.get(3).posSymbolA + "" + allProperties.get(3).posSymbolB);
		for (int i = 0; i < 17; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
		/*END row 1*/
		
		/* Row 2 */
		// border
		for (int i = 0; i < 81; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		// names
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(11).name);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(4).name);
		System.out.println("|");
		
		// costs
		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(11).cost);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");

		System.out.printf("%19s", "$" + allProperties.get(4).cost);
		System.out.println("|");
		
		// owners
		System.out.print("|");
		System.out.print(allProperties.get(11).posSymbolA + "" + allProperties.get(11).posSymbolB);
		System.out.printf("%17s", allProperties.get(11).owner);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.print(allProperties.get(4).posSymbolA + "" + allProperties.get(4).posSymbolB);
		System.out.printf("%17s", allProperties.get(4).owner);
		System.out.println("|");
		
		// border
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}

		System.out.printf("%30s",  "DISNEYLAND-OPOLY");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println("");
		/* END of row 2 */	
		
		// row 3
		// names
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(10).name);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");

		System.out.printf("%19s", allProperties.get(5).name);
		System.out.println("|");
		
		// costs
		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(10).cost);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");

		System.out.printf("%19s", "$" + allProperties.get(5).cost);
		System.out.println("|");
		
		// owners
		System.out.print("|");
		System.out.print(allProperties.get(10).posSymbolA + "" + allProperties.get(10).posSymbolB);
		System.out.printf("%17s", allProperties.get(10).owner);
		System.out.print("|");
		for (int i = 0; i < 39; i++) {
			System.out.print(" ");
		}
		System.out.print("|");

		System.out.print(allProperties.get(5).posSymbolA + "" + allProperties.get(5).posSymbolB);
		System.out.printf("%17s", allProperties.get(5).owner);
		System.out.println("|");
		
		// border
		for (int i = 0; i < 81; i++) {
			System.out.print("-");
		}
		System.out.println("");
		/* END of row 3 */		
		
		// row 4
		System.out.print("|");
		for (int i = 0; i < 19; i++) {
			System.out.print(" ");
		}
		
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(8).name);
		System.out.print("|");
		System.out.printf("%19s", allProperties.get(7).name);
		System.out.print("|");
		
		for (int i = 0; i < 19; i++) {
			System.out.print(" ");
		}
		
		System.out.println("|");
		
		System.out.print("|");


		System.out.printf("%19s", "GoToDowntownDisney");
		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(8).cost);
		System.out.print("|");
		System.out.printf("%19s", "$" + allProperties.get(7).cost);
		System.out.print("|");
		System.out.printf("%19s", "GetAutographs");

		System.out.println("|");
		
		System.out.print("|");
		
		
		System.out.print(allProperties.get(9).posSymbolA + "" + allProperties.get(9).posSymbolB);
		for (int i = 0; i < 17; i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		
		System.out.print(allProperties.get(8).posSymbolA + "" + allProperties.get(8).posSymbolB);
		System.out.printf("%17s", allProperties.get(8).owner);
		System.out.print("|");
		System.out.print(allProperties.get(7).posSymbolA + "" + allProperties.get(7).posSymbolB);
		System.out.printf("%17s", allProperties.get(7).owner);
		System.out.print("|");
		
		System.out.print(allProperties.get(6).posSymbolA + "" + allProperties.get(6).posSymbolB);
		for (int i = 0; i < 17; i++) {
			System.out.print(" ");
		}
		System.out.println("|");

		// bottom border
		for (int i = 0; i < 81; i++) {
			System.out.print("-");
		}
		System.out.println("");
		/* END of row 4 */
	}
	
	public static void printInfo(Vector<Property> allProperties, Player player1, Player player2) {
		System.out.println("Player1: " + "( " + player1.symbol + " )" + player1.name);
		System.out.println("    money: " + "$" + player1.money);
		System.out.println("    position: " + allProperties.get(player1.position).name);
		
		System.out.println("Player2: " + "( " + player2.symbol + " )" + player2.name);
		System.out.println("    money: " + "$" + player2.money);
		System.out.println("    position: " + allProperties.get(player2.position).name);
	}
	
	public static void updateGame(Player thisPlayer, Player otherPlayer, Vector<Property> allProperties, int AB) {
		System.out.println(thisPlayer.name + "'s turn:");
		Random rand = new Random();
		int randNum = rand.nextInt(3) + 1; // can either be 1, 2, 3 moves
		
		// clear symbol of original position
		if (AB == 'a') {
			allProperties.get(thisPlayer.position).posSymbolA = ' '; 
		} else {
			allProperties.get(thisPlayer.position).posSymbolB = ' ';
		}
		
		if (thisPlayer.position + randNum >= 12) {
			System.out.println("    Passed the START, receive $200");
			thisPlayer.position = (thisPlayer.position + randNum) % 12;
			thisPlayer.money += 200;
		} else {
		    thisPlayer.position += randNum;
		} 
		// move symbol to new position
		if (AB == 'a') {
			allProperties.get(thisPlayer.position).posSymbolA = thisPlayer.symbol; 
		} else {
			allProperties.get(thisPlayer.position).posSymbolB = thisPlayer.symbol;
		}
		//allProperties.get(thisPlayer.position).posSymbolA = thisPlayer.symbol;
		
		System.out.println("    " + thisPlayer.name + " rolled: " + randNum + " and is now at " + allProperties.get(thisPlayer.position).name);
		System.out.print("    Action Needed: ");
		Property newSpot = allProperties.get(thisPlayer.position);
		if (newSpot.owner == thisPlayer.name || newSpot.name == "DowntownDisney" || newSpot.name == "GetAutographs") {
			System.out.println("NONE");
		} else if (newSpot.name == "GoToDowntownDisney") {
			System.out.println("Shop at Downtown Disney, pay $300");
			// need to move symbol to new position
			// clear symbol of original position
			if (AB == 'a') {
				allProperties.get(thisPlayer.position).posSymbolA = ' '; 
			} else {
				allProperties.get(thisPlayer.position).posSymbolB = ' ';
			}
			
			thisPlayer.position = 3;
			thisPlayer.money -= 300;
			
			// move symbol to new position
			if (AB == 'a') {
				allProperties.get(thisPlayer.position).posSymbolA = thisPlayer.symbol; 
			} else {
				allProperties.get(thisPlayer.position).posSymbolB = thisPlayer.symbol;
			}
		} else if (newSpot.name == "Start") {
			System.out.println("Collect allowance of $200");
		} else if (newSpot.owner == "(no owner)") {
			System.out.println("Buy the property for $" + newSpot.cost + "? Y/N");
			Scanner in = new Scanner(System.in);
			String ready = in.nextLine();
			if (ready.equals("Y") || ready.equals("y")) {
				System.out.println("Bought " + newSpot.name + ".");
				thisPlayer.money -= newSpot.cost;
				newSpot.owner = thisPlayer.name;				
			}
		} else {
			System.out.println("Pay $" + newSpot.cost + " to " + otherPlayer.name);
			thisPlayer.money -= newSpot.cost;
			otherPlayer.money += newSpot.cost;
		}
	}
	
	public static int checkLose(Player thisPlayer, Player otherPlayer) {
		if (thisPlayer.money < 0) {
			System.out.println(otherPlayer.name + " wins!");
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Vector<Property> allProperties = initializeProperties();
		
		int over = 0;
		initializeGame(player1, player2, allProperties);
		Player thisPlayer = player1;
		Player otherPlayer = player2;
		char AB = 'a';
		
		while (over == 0) {
			displayBoard(allProperties, player1, player2);
			printInfo(allProperties, player1, player2);
		
			System.out.println("Press ENTER to roll the dice");
			Scanner in = new Scanner(System.in);
			String ready = in.nextLine();
			
			updateGame(thisPlayer, otherPlayer, allProperties, AB);
			System.out.println("Press ENTER when ready");
			ready = in.nextLine();
			
			// check if game over
			over = checkLose(thisPlayer, otherPlayer);
			if (over == 1) {
				System.out.println("GAME OVER!");
				break;
			}
			
			// switch player's turn
			if (thisPlayer == player1) {
				thisPlayer = player2;
				otherPlayer = player1;
				AB = 'b';
			} else {
				thisPlayer = player1;
				otherPlayer = player2;
				AB = 'a';
			}
		}
	}
}
