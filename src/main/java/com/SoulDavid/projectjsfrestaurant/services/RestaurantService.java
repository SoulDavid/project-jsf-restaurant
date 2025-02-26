/**
 * 
 */
package com.SoulDavid.projectjsfrestaurant.services;

import java.util.ArrayList;
import java.util.List;

import com.SoulDavid.projectjsfrestaurant.entities.Restaurant;

/**
 * @author SoulDavid
 * Clase que permite realizar la logica de negocio para empleados.
 */
public class RestaurantService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresa de IT
	 * @return {@link Employer} lista de empleados
	 */
	public List<Restaurant> consultRestaurant()
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		
		Restaurant mcDonalds = new Restaurant();
		Restaurant VidArgentina = new Restaurant();
		Restaurant Chilaca = new Restaurant();
		Restaurant Cienaga = new Restaurant();
		Restaurant Socarrat = new Restaurant();
		
		mcDonalds.setName("McDonalds");
		mcDonalds.setDirection("Direccion 1");
		mcDonalds.setCountry("Estados Unidos");
		mcDonalds.setManager("Diego Paniagua");
		
		VidArgentina.setName("La Vid Argentina");
		VidArgentina.setDirection("Direccion 2");
		VidArgentina.setCountry("Argentina");
		VidArgentina.setManager("Florentino Perez");
		
		Chilaca.setName("La Chilaca");
		Chilaca.setDirection("Direccion 3");
		Chilaca.setCountry("Chile");
		Chilaca.setManager("Arturo Vidal");
		
		Cienaga.setName("Cienaga");
		Cienaga.setDirection("Direccion 4");
		Cienaga.setCountry("Colombia");
		Cienaga.setManager("Valderrama");
		
		Socarrat.setName("Socarrat");
		Socarrat.setDirection("Direccion 5");
		Socarrat.setCountry("España");
		Socarrat.setManager("Amador Rivas");
		
		restaurants.add(mcDonalds);
		restaurants.add(VidArgentina);
		restaurants.add(Chilaca);
		restaurants.add(Cienaga);
		restaurants.add(Socarrat);
		
		return restaurants;
	}
}