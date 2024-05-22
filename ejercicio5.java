import java.util.Scanner;



public class ejercicio5 {

	public static void main(String[] args) { //EJERCICIO 5

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce el primer número: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Introduce el segundo número: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Introduce la operación (+, -, *, /): ");
		        char operacion = scanner.next().charAt(0);

		        double resultado;
		        
		        

		        switch (operacion) {
		            case '+':
		                resultado = num1 + num2;
		                System.out.println("El resultado es: " + resultado);
		                break;
		            case '-':
		                resultado = num1 - num2;
		                System.out.println("El resultado es: " + resultado);
		                break;
		            case '*':
		                resultado = num1 * num2;
		                System.out.println("El resultado es: " + resultado);
		                break;
		            case '/':
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		                    System.out.println("El resultado es: " + resultado);
		                } else {
		                    System.out.println("Error: División por cero.");
		                }
		                break;
		            default:
		                System.out.println("Operación no válida.");
		        }
		        scanner.close();
		    }
		


	}


