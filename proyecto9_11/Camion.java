package com.cursojava.proyecto9_11;

import java.time.LocalDate;

public class Camion extends Vehiculo implements ITV{
	protected int ultimaItv;
	public static final int AÑOS_ITV=2;
	static int numCamiones; 
	
	/**
	 * Constructor con parametros de la clase Camión
	 * @param km Distancia recorrida en km por la Camión
	 * @param ultimaItv Año de la ultima revisión del Camión
	 */
	public Camion(int km, int ultimaItv) {
		super(km);
		this.ultimaItv = ultimaItv;
		this.numCamiones++;
	}

	/**
	 * Implementación específica para Camión del método heredado de la interfaz ITV
	 */
	@Override
	public void pasarITV() {
		LocalDate fecha = LocalDate.now();
		int añoActual = fecha.getYear();
		if(añoActual-this.ultimaItv>=this.AÑOS_ITV) {
			System.out.println("Este camion debe pasar la ITV este año");
		}else {
			System.out.println("Este camion tiene la ITV en regla");
		}
	}
	
	/**
	 * Cadena de texto describiendo el objeto
	 */
	@Override
	public String toString() {
		return "El camión con identificador " +this.identificador+" tiene "+ this.km + "km y tuvo su ultima ITV el año "+this.ultimaItv;
	}

}
