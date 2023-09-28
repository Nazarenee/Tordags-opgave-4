import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	
private ArrayList<String> actions;







public GameMenu(ArrayList<String> actions){
this.actions = actions;

}


public void displayMenu(){
	for (String s : actions)
      System.out.println(s);
}



public String getAction(){
System.out.println("Type a number to choose an action");
Scanner scanner = new Scanner(System.in);
String choise = scanner.nextLine();
scanner.close();
return choise;
}




}


