import java.util.Scanner;
public class PizzaTime {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("Pizza Time!");
        String location = "";

        System.out.println("Whats your streets name?: ");
        String streetname = scanner.nextLine();

        scanner.nextLine();
        System.out.println("What is your street number?; ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what city are you in?; ");
        String city = scanner.nextLine();
        scanner.nextLine();
        System.out.println("what is your area code?: ");
        //in a A1A-1A1 format
        String area = scanner.nextLine();
        char firstchar = area.charAt(0);
        boolean isFirstCharLetter = Character.isLetter(firstchar); // Returns true
        System.out.println(isFirstCharLetter);
        char secchar = area.charAt(2);
        boolean issecCharLetter = Character.isLetter(secchar); // Returns true
        char thirchar = area.charAt(5);
        boolean isthirCharLetter = Character.isLetter(thirchar); // Returns true
    }
    
}