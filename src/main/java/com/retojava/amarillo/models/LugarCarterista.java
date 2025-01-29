package com.retojava.amarillo.models;

public class LugarCarterista {
    private String DNI;
    private double latitud;
    private double longitud;

    public LugarCarterista() {
    }
    
    public LugarCarterista(String DNI, double latitud, double longitud) {
        this.DNI = DNI;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

	@Override
	public String toString() {
		return "LugarCarterista [DNI=" + DNI + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}

}
