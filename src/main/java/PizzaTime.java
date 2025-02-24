import java.util.Scanner;
public class PizzaTime {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("Pizza Time!");
        boolean svalid = false;
        boolean bvalid = false;
        boolean tvalid = false;
        boolean gvalid = false;
            while(!svalid){

            String[] stringArray;
            stringArray = new String[]{"Burrows", "Main", "Henderson", "Magnus", "Mountain"};
            System.out.println("Whats your streets name?: ");
            String streetname = scanner.nextLine();
            if(streetname.equals("Burrows")){
                svalid = true;
            }
            else if(streetname.equals("Main")){
            svalid = true;
        }
            else if(streetname.equals("Henderson")){
            svalid = true;
        }
            else if(streetname.equals("Magnus")){
            svalid = true;
        }
            else if(streetname.equals("Mountain")){
            svalid = true;
        }
        System.out.println(svalid);
        }
        System.out.println("What is your street number?; ");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            
            
            scanner.nextLine();
            System.out.println("Wrong, this needs to be a number");
            
        }
            int number = scanner.nextInt();
            scanner.nextLine();
        while(!tvalid){
            System.out.println("what city are you in?; ");
            String city = scanner.nextLine();
            scanner.nextLine();
            if(!city.equals("Winnipeg")){
                System.out.println("Sorry but we don't deliver outside of Winnipeg");
            }
            else if (city.equals("Winnipeg")){
                tvalid = true;
            }
        }
        while(!gvalid){
            System.out.println("what is your area code?: ");
            //in a A1A-1A1 format
            String area = scanner.nextLine();
            scanner.nextLine();
            char firstchar = area.charAt(0);
            boolean isFirstCharLetter = Character.isLetter(firstchar); // Returns true
            System.out.println(isFirstCharLetter);
            char secchar = area.charAt(2);
            boolean issecCharLetter = Character.isLetter(secchar); // Returns true
            char thirchar = area.charAt(5);
            boolean isthirCharLetter = Character.isLetter(thirchar); // Returns true
            
        }
        
    }
    
}