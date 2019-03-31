package coche;

public class coche {

		Integer cilindrada;
		String color;
		Double precio;
		boolean isArrancado;
		
		void arrancar() {
			if(isArrancado !=true) {
				isArrancado = true;
				System.out.println("¡¡¡Brrrrrrr!!! El coche acaba de arrancar.");
				
			}else	{
				System.out.println("¡¡¡Kisch,kishch!!! El coche ya está arrancado.");
				}
		}
			
		void verCoche() {
			System.out.println("Este coche es de color" + color + " tiene una cilindrada " + cilindrada + " y cuesta " + precio + " euros.");
		 
			
		
    }
		
				
}

