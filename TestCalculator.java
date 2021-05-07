package souza;

import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result = " + calc.getResult());
        calc.add(5.0f);
        calc.multiply(3.0f);
        calc.subtract(1.0f);
        calc.divide(2.0f);
        System.out.println("Result = " + calc.getResult());

        Scanner scanner = new Scanner(System.in);
        String choice;

        do{
            System.out.println("\nResult = " + calc.getResult());
            System.out.println("Choose one operation(add, subtract, multiply, divide, reset, exit): ");
            choice = scanner.nextLine();

            if(choice.equals("add")){
                System.out.println("Enter a value: ");
                float value = Float.parseFloat(scanner.nextLine());
                calc.add(value);
            }else if(choice.equals("subtract")){
                System.out.println("Enter a value: ");
                float value = Float.parseFloat(scanner.nextLine());
                calc.subtract(value);
            }else if(choice.equals("multiply")){
                System.out.println("Enter a value: ");
                float value = Float.parseFloat(scanner.nextLine());
                calc.multiply(value);
            }else if(choice.equals("divide")){
                System.out.println("Enter a value: ");
                float value = Float.parseFloat(scanner.nextLine());
                calc.divide(value);
            } else if(choice.equals("reset")) {
                calc.reset();
            }else if(choice.equals("exit")){
                System.out.println("Goodbye!");
            }else {
                System.out.println("Invalid choice");
            }
        }while (!choice.equals("exit"));
    }
}
