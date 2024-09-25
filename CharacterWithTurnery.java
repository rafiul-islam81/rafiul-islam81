import java.util.Scanner;

public class CharacterWithTurnery {
    @SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character below: ");
    char a = sc.next().charAt(0);
    
    String out = ((a>='a' && a<='z') || (a>='A' && a<='Z')) ? (a+" is a character") : (a+" is not a character!");
    System.out.println(out);
    }
}
