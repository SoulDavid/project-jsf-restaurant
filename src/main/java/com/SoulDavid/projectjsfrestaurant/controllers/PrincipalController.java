/**
 * 
 */
package com.SoulDavid.projectjsfrestaurant.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.SoulDavid.projectjsfrestaurant.entities.Restaurant;
import com.SoulDavid.projectjsfrestaurant.services.RestaurantService;

/**
 * @author SoulDavid
 * Clase controller que se encarga de procesar la información para la pantalla principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de restaurantes para la tabla.
	 */
	private List<Restaurant> restaurants;
	/**
	 * Servicio con los metodos que realizan la logica de restaruantes
	 */
	private RestaurantService restaurantService = new RestaurantService();
	
	/**
	 * Metodo que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultRestaurants();
	}
	
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultRestaurants() {
		this.restaurants = this.restaurantService.consultRestaurant();
	}
	/**
	 * @return the employers
	 */
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	/**
	 * @param employers the employers to set
	 */
	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
}