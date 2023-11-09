/**
 * 
 */
package com.cursojava.proyecto9_11;

/**
 * @author Admin
 *
 */
public class Bicicleta extends Vehiculo {
	protected int marchas;
	static int numBicis;
	

	/**
	 * Constructor con parametros de la clase Bicicleta
	 * @param km Distancia recorrida en km por la Bicicleta
	 * @param marchas Numero de marchas de la Bicicleta
	 */
	public Bicicleta(int km, int marchas) {
		super(km);
		this.marchas = marchas;
		numBicis++;
	}
	
	/**
	 * Cadena de texto describiendo el objeto
	 */
	@Override
	public String toString() {
		return "La bicicleta con identificador " +this.identificador+" tiene "+ this.marchas+" marchas y ha recorrido "+this.km + "km";
	}

}
