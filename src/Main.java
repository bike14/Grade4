import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 49){
            System.out.println("grade F "+ number);
        } else if (number > 49 && number <= 60){
            System.out.println("grade D "+ number);
        }
        else if (number > 60 && number <= 69){
            System.out.println("grade C "+ number);
        }
        else if (number > 69 && number <= 79){
            System.out.println("grade B "+ number);
        }
        else {
            System.out.println("grade a "+ number);
        }
    }
}