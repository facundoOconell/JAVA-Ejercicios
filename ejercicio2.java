
public class ejercicio2 {  //EJERCICIO 2

	public static void main(String[] args) {
		for(int i=50; i <=100; i++) {
			
			int cont =0;
			for(int x=1; x<i+1;x++) {
				
				if(i%x==0) {
					
					cont++;
					
				}
				
			}
			
			if(cont==2) {
				
				System.out.println("ES PRIMO");
				
			}else {
				
				System.out.print(i + " Divisores :");
				
				for(int x=1; x<i+1;x++) {
					
					if(i%x==0) {
						
						System.out.print(x + " ");
						
					}
					
				}
				
				System.out.println();
				

				
				
				
				
			}
		}

	}

}
