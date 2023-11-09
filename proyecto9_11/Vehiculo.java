/**
 * 
 */
package com.cursojava.proyecto9_11;

/**
 * @author Admin
 *
 */
public abstract class Vehiculo {
	static int sum; 
	public int identificador;
	private boolean enMarcha;
	int km;
	
	/**
	 * Constructor de la clase Vehiculo
	 * @param km Cantidad de kilometros recorridos
	 */
	public Vehiculo(int km) {
		super();
		this.km = km;
		sum++;
		identificador+=sum;
	}
	/**
	 * Método en el que se arranca el vehículo
	 */
	public void arrancar() {
		if(!enMarcha) {
			System.out.println("El vehiculo "+identificador+" ha arrancado");
			enMarcha=true;
		}else System.out.println("Ya esta en marcha");
		
	};
	
	/**
	 * Método en el que se detiene el vehículo
	 */
	public void parar(){
		if(enMarcha) {
			System.out.println("El vehiculo "+identificador+" se ha detenido");
			enMarcha=false;
		}else System.out.println("Ya esta detenido");
	};
	
}
