import java.util.Scanner;

public class Main {
    public static double Addition(double x, double y){
        return x + y;
    }

    public static double Subtraction(double x, double y){
        return x - y;
    }

    public static double Multiplication(double x, double y){
        return x * y;
    }

    public static double Division(double x, double y){
        return x / y;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\nResponse: ");
        int response = scanner.nextInt();

        if (response >= 1 && response <= 4) {

            System.out.println("\nWrite to number: ");
            double number_one = scanner.nextDouble();

            System.out.println("\nWrite to number: ");
            double number_two = scanner.nextDouble();

            if (response == 1) {
                System.out.println(number_one + " + " + number_two + " = " + Addition(number_one, number_two));
            } else if (response == 2) {
                System.out.println(number_one + " - " + number_two + " = " + Subtraction(number_one, number_two));
            } else if (response == 3) {
                System.out.println(number_one + " x " + number_two + " = " + Multiplication(number_one, number_two));
            } else if (response == 4) {
                System.out.println(number_one + " : " + number_two + " = " + Division(number_one, number_two));
            }
        }
        else{
            System.out.println("Digite uma Opção Válida. Tente Novamente! :( ");
        }

        scanner.close();
    }
}
