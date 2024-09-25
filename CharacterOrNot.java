import java.util.Scanner;

public class CharacterOrNot {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.print("Enter a character here: ");
        a = sc.next().charAt(0);

        if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
            System.out.println(a +" is a character!");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
