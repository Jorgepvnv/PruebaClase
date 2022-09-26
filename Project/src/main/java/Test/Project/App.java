package Test.Project;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
    System.out.println("Buenos días. ¿Cómo te llamas?:  ");
    String s = in.nextLine();
    System.out.println("Te quiero, " + s);
  }
}