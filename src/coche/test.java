package coche;

public class test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		coche c;
		
		c = new coche();
		c.cilindrada = 1800;
		c.color = "plata";
		c.precio = 25000.0;
		
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();

	}

}
