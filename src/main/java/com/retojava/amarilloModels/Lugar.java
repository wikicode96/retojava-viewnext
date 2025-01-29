package com.retojava.amarilloModels;

import java.util.Arrays;

public class Lugar {
    private String nombre;
    private String direccion;
    private double latitud;
    private double longitud;
    private String categoria;
    private int[] lineasDeAutobus;


    public Lugar() {
    }
    
    public Lugar(String nombre, String direccion, double latitud, double longitud, String categoria, int[] lineasDeAutobus) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.categoria = categoria;
        this.lineasDeAutobus = lineasDeAutobus;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int[] getLineasDeAutobus() {
        return lineasDeAutobus;
    }

    public void setLineasDeAutobus(int[] lineasDeAutobus) {
        this.lineasDeAutobus = lineasDeAutobus;
    }

	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud="
				+ longitud + ", categoria=" + categoria + ", lineasDeAutobus=" + Arrays.toString(lineasDeAutobus) + "]";
	}

}
