import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String welcome_message = "Enter your Name:";
        String player_name;
        int random_number;
        int guess_number;
        System.out.print(welcome_message);
        Scanner scanner = new Scanner(System.in);
        player_name = scanner.nextLine();
        System.out.println("Hi...! "+player_name);

        Random random = new Random();
        random_number = random.nextInt(20);
        System.out.println("The system has generated a number within 20. Guess that number....");
        int index=1;
        do{
            System.out.print("Enter the number (guess "+index+"): ");
            Scanner scanner1 = new Scanner(System.in);
            guess_number=Integer.parseInt(scanner1.nextLine());

            if (guess_number==random_number){
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }else{
                index++;
            }
        }while(index<=5);

        if(index>5){

            System.out.println("Sorry, you have exceeded the maximum number of attempts.\nSystem generated number is "+random_number);
        }

    }
}