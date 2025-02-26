package com.SoulDavid.projectjsfrestaurant.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author SoulDavid
 * Clase que permite controlar el funcionamiento de la pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {
	private String user;
	
	private String password;
	
	public void Access( ) {
		System.out.println("User: " + user);
		
		if (user.equals("SoulDavid") && password.equals("12345")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_INFO, "User correcto", ""));
			try {
				this.reDirection("principal.xhtml");
			} catch(IOException e)
			{
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Web non existant", ""));
				e.printStackTrace();
			}
		
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_ERROR, "User y/o password incorrecto", ""));
		}
	}

	private void reDirection(String web_page) throws IOException{
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(web_page);
	}
	
	
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}