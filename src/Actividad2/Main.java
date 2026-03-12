package Actividad2;



public class Main {

	public static void main(String[] args) {
		
		Automovil auto1 = new Automovil();
		
//		auto1 = es el objeto 
		
		auto1.marca = "Volasbagen";
		auto1.modelo = "Zmech";
		auto1.nombreDueno = "Piter";
		
		
		
		auto1.mostrarDatos();
		auto1.mostrarEstado();
		auto1.avanzar();
		auto1.abrirPuertas();
		auto1.llenarTanque();
		auto1.encender();
		auto1.avanzar();
		auto1.mostrarEstado();
		;
		// Auto 2

		
	}

}
