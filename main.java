import java.util.Scanner;
class main{

public static void main(String[] args){
System.out.println("Please type your name");

Scanner scanner = new Scanner(System.in);

String name = scanner.nextLine();

System.out.println("Greetings " + name + " " + "Please type your age");

String input = scanner.nextLine();
int age = Integer.parseInt(input);

System.out.println(age);

int retirement = 67 - age;

System.out.println("You can retire in " + retirement + " " + "Years");

}
}