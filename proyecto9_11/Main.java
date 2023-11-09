package com.cursojava.proyecto9_11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehiculo>vs=new ArrayList<>();
		
		vs.add(new Coche(48571,2019));
		vs.add(new Bicicleta(245,2));
		vs.add(new Camion(303540,2022));
		for (Vehiculo v : vs) {
			System.out.println(v.toString());
			if(v instanceof ITV) {
				((ITV)v).pasarITV();}
			v.arrancar();
			v.parar();
			System.out.println("*************************");
		}
		
		int totalVehiculos= Coche.numCoches+Bicicleta.numBicis+Camion.numCamiones;
		
		System.out.println("El total de vehiculos es "+totalVehiculos);
	}

}
