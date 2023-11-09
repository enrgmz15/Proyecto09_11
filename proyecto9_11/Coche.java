/**
 * 
 */
package com.cursojava.proyecto9_11;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @author Admin
 *
 */
public class Coche extends Vehiculo implements ITV {
	protected int ultimaItv;
	static int numCoches;
	public final static int AÑOS_ITV=4;
	
	/**
	 * Constructor con parametros de la clase Coche
	 * @param km Km recorridos heredados de Vehiculo
	 * @param ultimaItv Año en el que este coche tuvo su ultima itv
	 */
	public Coche(int km, int ultimaItv) {
		super(km);
		this.ultimaItv = ultimaItv;
		this.numCoches++;
	}
	
	/**
	 * Implementación específica para Coche del método heredado de la interfaz ITV
	 */
	@Override
	public void pasarITV() {
		LocalDate fecha = LocalDate.now();
		int añoActual = fecha.getYear();
		if(añoActual-this.ultimaItv>=this.AÑOS_ITV) {
			System.out.println("Este coche debe pasar la ITV");
		}else {
			System.out.println("Este coche tiene la ITV en regla");
		}
	}
	
	/**
	 * Cadena de texto describiendo el objeto
	 */
	@Override
	public String toString() {
		return "El coche con identificador " +this.identificador+" tiene "+ this.km + "km y tuvo su ultima ITV el año "+this.ultimaItv;
	}
	
	
	
}
