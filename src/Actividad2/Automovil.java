package Actividad2;

public class Automovil {
	// Atributos~~~~
	
	String marca;
	String modelo;
	String nombreDueno;
	
	boolean estaEncendido;
	boolean estaAbierto = false;
	boolean estaVacio = true;
	
	int kilometraje = 0;
	int nivelCombustible = 0; 

	
	
	
	public void llenarTanque() {
		
		estaVacio = false;
		nivelCombustible = 100;
		System.out.println("Tanque lleno");
		
	}
	
	public void encender() {
		if (estaVacio || nivelCombustible == 0) {
			System.err.println("ERROOOOR: NO HAY NAFTA CHAVAL");
		}
		else {
			System.out.println("Auto Encendido");
			estaEncendido = true;
			
		}
	}
	public void avanzar() {
		if (estaEncendido && !estaVacio) {
			kilometraje+= 10;
			nivelCombustible-=20;
			
			System.out.println("Avanzaste " + kilometraje + "Km" 
					);
		}
		else {
			System.err.println("NO PODES AVANZAR");
		}
	}

	//@Override //el metodo pertenece a otra clase
	public String mostrarDatos() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", nombreDueno=" + nombreDueno + ", estaEncendido="
				+ estaEncendido + ", estaAbierto=" + estaAbierto + ", estaVacio=" + estaVacio + ", kilometraje="
				+ kilometraje + ", nivelCombustible=" + nivelCombustible + "]";
		
	}
	public void abrirPuertas() {
		
		if (estaEncendido == false) {
			System.out.println("Abriendo puertas");
			estaAbierto = true;
		} else {
			System.err.println("No se puede abrir");
		}
	}
	public void mostrarEstado() {
		System.out.println(mostrarDatos());
		
	}
	
}
