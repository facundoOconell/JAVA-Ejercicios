import java.util.Scanner;

public class ejercicio3 { //EJERCICIO 3

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
while(true) {
		
		
		int numero;
		
		System.out.println("INGRESE UN NUMERO : ");
		
		numero = Scan.nextInt();
		
		
		
		
		
		if(numero > 100 && esPrimo(numero)) {
			
			
			System.out.println("El numero cumple con las condiciones");
			
			break;
		}else {
			
			System.out.println(" No cumple con las condiciones");
		}	
		
		Scan.close();
		
	}
	
	}
	
	
	//FUNCION ES PRIMO
	
	 public static boolean esPrimo(int num) {
	        if (num <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true; 
	    }

}
