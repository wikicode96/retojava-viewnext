package com.retojava.amarillo.models;

public class Carterista {
	private String dni;
    private String foto;
    private String nombre;
    private String apellidos;
    private String cabello;
    private String ojos;
    private String estatura;
    private String genero;
    
    public Carterista() {
	}
    
	public Carterista(String dni, String foto, String nombre, String apellidos, String cabello, String ojos,
			String estatura, String genero) {
		this.dni = dni;
		this.foto = foto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cabello = cabello;
		this.ojos = ojos;
		this.estatura = estatura;
		this.genero = genero;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCabello() {
		return cabello;
	}
	public void setCabello(String cabello) {
		this.cabello = cabello;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public String getEstatura() {
		return estatura;
	}
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Carterista [dni=" + dni + ", foto=" + foto + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", cabello=" + cabello + ", ojos=" + ojos + ", estatura=" + estatura + ", genero=" + genero + "]";
	}
	
	
    
    
}
