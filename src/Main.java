import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String welcome_message = "Enter your Name:";
        String player_name;
        System.out.print(welcome_message);
        Scanner scanner = new Scanner(System.in);
        player_name = scanner.nextLine();
        System.out.println("Hi...! "+player_name);

    }
}